package com.example.smileyrestaurant.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityAccountBinding;
import com.google.api.core.ApiFuture;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class AccountActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ActivityAccountBinding mActivityAccountBinding;

    List<String> userrole;

    FirebaseFirestore db;

    public static final String COLLECTION_NAME_KEY = "STAFFS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mActivityAccountBinding = DataBindingUtil.setContentView(this, R.layout.activity_account);

        //firestore initiation
        db = FirebaseFirestore.getInstance();

//        DocumentReference docRef = db.collection(COLLECTION_NAME_KEY);
        //asynchronously retrieve all documents
        ApiFuture<QuerySnapshot> future = (ApiFuture<QuerySnapshot>) db.collection(COLLECTION_NAME_KEY).get();
        //future.get() blocks on response
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            // TODO finish up logics of tabulating data from document
        }

        //Spinner intiation
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Spinner spinner3 = findViewById(R.id.spinner3);
        Spinner spinner4 = findViewById(R.id.spinner4);
        Spinner spinner5 = findViewById(R.id.spinner5);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setOnItemSelectedListener(this);

        userrole = new ArrayList<String>();
        userrole.add("welcome");
        userrole.add("servers");
        userrole.add("kitchen");
        userrole.add("till");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, userrole);

        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner1.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter);
        spinner3.setAdapter(dataAdapter);
        spinner4.setAdapter(dataAdapter);
        spinner5.setAdapter(dataAdapter);
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), userrole.get(position), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}