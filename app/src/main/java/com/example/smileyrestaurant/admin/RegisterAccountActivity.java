package com.example.smileyrestaurant.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityRegisterAccountBinding;
import com.example.smileyrestaurant.model.Staff;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class RegisterAccountActivity extends AppCompatActivity {

    ActivityRegisterAccountBinding mActivityRegisterAccountBinding;

    FirebaseFirestore db;

    List<String> userrole;

    Spinner spinner1;

    public static final String COLLECTION_NAME_KEY = "STAFFS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);

        mActivityRegisterAccountBinding = DataBindingUtil.setContentView(this, R.layout.activity_register_account);

        db = FirebaseFirestore.getInstance();

        //spinner initiation
        spinner1 = findViewById(R.id.spinner_registerstaffrole);

        userrole = new ArrayList<String>();
        userrole.add("welcome");
        userrole.add("servers");
        userrole.add("kitchen");
        userrole.add("till");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, userrole);

        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner1.setAdapter(dataAdapter);
    }

    public void registeraccount(View view) {
        Staff newstaff = new Staff();
        newstaff.setUsername(mActivityRegisterAccountBinding.editTextTextPersonName.getText().toString());
        newstaff.setPassword(mActivityRegisterAccountBinding.editTextTextPassword.getText().toString());
        newstaff.setRole(mActivityRegisterAccountBinding.spinnerRegisterstaffrole.getSelectedItem().toString());
        db.collection(COLLECTION_NAME_KEY).document(mActivityRegisterAccountBinding.editTextTextPersonName.getText().toString()).set(newstaff);

//        DocumentReference docRefNewUser = db.collection(COLLECTION_NAME_KEY).document();
//        docRefNewUser.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//            @Override
//            public void onSuccess(DocumentSnapshot documentSnapshot) {
//                if (!documentSnapshot.exists()){
//                    Staff newstaff = new Staff();
//                    newstaff.setUsername(mActivityRegisterAccountBinding.editTextTextPersonName.getText().toString());
//                    newstaff.setPassword(mActivityRegisterAccountBinding.editTextTextPassword.getText().toString());
//                    newstaff.setRole(mActivityRegisterAccountBinding.spinnerRegisterstaffrole.getSelectedItem().toString());
//                    db.collection(COLLECTION_NAME_KEY).document(mActivityRegisterAccountBinding.editTextTextPersonName.getText().toString()).set(newstaff);
//                }
//            }
//        });

        Intent goback = new Intent(RegisterAccountActivity.this, AccountActivity.class);
        startActivity(goback);
        mActivityRegisterAccountBinding.editTextTextPassword.setText("");
        mActivityRegisterAccountBinding.editTextTextPersonName.setText("");
        mActivityRegisterAccountBinding.spinnerRegisterstaffrole.setSelection(0);
    }
}