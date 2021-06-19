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
import com.example.smileyrestaurant.model.Staff;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.api.core.ApiFuture;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class AccountActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ActivityAccountBinding mActivityAccountBinding;

    List<String> userrole, userrole2, userrole3, userrole4, userrole5, userrole6;

    FirebaseFirestore db;

    Spinner spinner1, spinner2, spinner3, spinner4, spinner5;

    Staff chef, waiter, waiter1, waitress;

    public static final String COLLECTION_NAME_KEY = "STAFFS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mActivityAccountBinding = DataBindingUtil.setContentView(this, R.layout.activity_account);

        //firestore initiation
        db = FirebaseFirestore.getInstance();

//        DocumentReference docRef = db.collection(COLLECTION_NAME_KEY);
//        //asynchronously retrieve all documents
//        ApiFuture<QuerySnapshot> future = (ApiFuture<QuerySnapshot>) db.collection(COLLECTION_NAME_KEY).get();
//        //future.get() blocks on response
//        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
//        for (QueryDocumentSnapshot document : documents) {
//            // TODO finish up logics of tabulating data from document
//        }


        //Spinner intiation
        spinner1 = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);

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

        DocumentReference docRefchef = db.collection(COLLECTION_NAME_KEY).document("chef");
        docRefchef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()){
                    chef = documentSnapshot.toObject(Staff.class);
                    String chef_username = chef.getUsername();
                    String chef_role = chef.getRole();
                    mActivityAccountBinding.textViewUserid1.setText(chef_username);
                    mActivityAccountBinding.textviewUserrole1.setText(chef_role);
                }
            }
        });
        DocumentReference docRefwaiter = db.collection(COLLECTION_NAME_KEY).document("waiter");
        docRefwaiter.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()){
                    waiter = documentSnapshot.toObject(Staff.class);
                    String waiter_username = waiter.getUsername();
                    String waiter_role = waiter.getRole();
                    mActivityAccountBinding.textViewUserid2.setText(waiter_username);
                    mActivityAccountBinding.textviewUserrole2.setText(waiter_role);
                }
            }
        });
        DocumentReference docRefwaiter1 = db.collection(COLLECTION_NAME_KEY).document("waiter1");
        docRefwaiter1.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()){
                    waiter1 = documentSnapshot.toObject(Staff.class);
                    String waiter1_username = waiter1.getUsername();
                    String waiter1_role = waiter1.getRole();
                    mActivityAccountBinding.textViewUserid3.setText(waiter1_username);
                    mActivityAccountBinding.textViewUserrole3.setText(waiter1_role);
                }
            }
        });
        DocumentReference docRefwaitress = db.collection(COLLECTION_NAME_KEY).document("waitress");
        docRefwaitress.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()){
                    waitress = documentSnapshot.toObject(Staff.class);
                    String waitress_username = waitress.getUsername();
                    String waitress_role = waitress.getRole();
                    mActivityAccountBinding.textViewUserid4.setText(waitress_username);
                    mActivityAccountBinding.textViewUserrole4.setText(waitress_role);
                }
            }
        });



        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, userrole);

        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner1.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter);
        spinner3.setAdapter(dataAdapter);
        spinner4.setAdapter(dataAdapter);
        spinner5.setAdapter(dataAdapter);

        mActivityAccountBinding.textViewUserid5.setVisibility(View.GONE);
        mActivityAccountBinding.textViewUserrole5.setVisibility(View.GONE);
        mActivityAccountBinding.spinner5.setVisibility(View.GONE);
        mActivityAccountBinding.buttonSavechange5.setVisibility(View.GONE);
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), userrole.get(position), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, String.valueOf(id), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void savechange1(View view) {
        String text = spinner1.getSelectedItem().toString();
        chef.setRole(text);
        db.collection(COLLECTION_NAME_KEY).document("chef").set(chef);
    }

    public void savechange2(View view) {
        String text = spinner2.getSelectedItem().toString();
        waiter.setRole(text);
        db.collection(COLLECTION_NAME_KEY).document("waiter").set(waiter);
    }

    public void savechange3(View view) {
        String text = spinner3.getSelectedItem().toString();
        waiter1.setRole(text);
        db.collection(COLLECTION_NAME_KEY).document("waiter1").set(waiter1);
    }

    public void savechange4(View view) {
        String text = spinner4.getSelectedItem().toString();
        waitress.setRole(text);
        db.collection(COLLECTION_NAME_KEY).document("waitress").set(waitress);
    }

    public void savechange5(View view) {
        String text = spinner5.getSelectedItem().toString();
    }
}