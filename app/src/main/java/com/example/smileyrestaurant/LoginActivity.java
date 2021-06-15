package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.smileyrestaurant.databinding.ActivityLoginBinding;
import com.example.smileyrestaurant.model.Staff;
import com.example.smileyrestaurant.till.TillActivity;
import com.example.smileyrestaurant.welcome.AssignTableActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

//    private static final String TAG = "EmailPassword";
//    private static FirebaseAuth mAuth;

    private ActivityLoginBinding mActivityLoginBinding;

//    List<Staff> staffList;
    FirebaseFirestore db;

    public static final String COLLECTION_NAME_KEY = "STAFFS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        db = FirebaseFirestore.getInstance();
    }

    public void loginAccount(View view) {

        if (!mActivityLoginBinding.editTextUsername.getText().toString().equals("") && !mActivityLoginBinding.editTextPassword.getText().toString().equals("")){
            DocumentReference docRef = db.collection(COLLECTION_NAME_KEY).document(mActivityLoginBinding.editTextUsername.getText().toString());
            docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                @Override
                public void onSuccess(DocumentSnapshot documentSnapshot) {
                    if (documentSnapshot.exists()){
                        Staff staff = documentSnapshot.toObject(Staff.class);

                        if (staff.getPassword().equals(mActivityLoginBinding.editTextPassword.getText().toString())){

                            if (staff.getRole().equals("welcome")){
//                                Toast.makeText(getApplicationContext(), "Welcome to Smiley Restaurant :)", Toast.LENGTH_SHORT).show();
                                Intent welcome = new Intent(LoginActivity.this, AssignTableActivity.class);
                                startActivity(welcome);
                                mActivityLoginBinding.editTextUsername.setText("");
                                mActivityLoginBinding.editTextPassword.setText("");
                                mActivityLoginBinding.progressBarLogin.setVisibility(View.INVISIBLE);
                            }
                              else if (staff.getRole().equals("servers")){
                                Toast.makeText(getApplicationContext(), "Welcome to Smiley Restaurant :)", Toast.LENGTH_SHORT).show();
                                Intent servers = new Intent(LoginActivity.this, MainActivity.class);
                                startActivity(servers);
                                mActivityLoginBinding.editTextUsername.setText("");
                                mActivityLoginBinding.editTextPassword.setText("");
                                mActivityLoginBinding.progressBarLogin.setVisibility(View.INVISIBLE);
                            } else if (staff.getRole().equals("till")){
                                Toast.makeText(getApplicationContext(), "Welcome to Smiley Restaurant :)", Toast.LENGTH_SHORT).show();
                                Intent till = new Intent(LoginActivity.this, TillActivity.class);
                                startActivity(till);
                                mActivityLoginBinding.editTextUsername.setText("");
                                mActivityLoginBinding.editTextPassword.setText("");
                                mActivityLoginBinding.progressBarLogin.setVisibility(View.INVISIBLE);
                            } else if (staff.getRole().equals("kitchen")){
                                Toast.makeText(getApplicationContext(), "Welcome to Smiley Restaurant :)", Toast.LENGTH_SHORT).show();
                                Intent kitchen = new Intent(LoginActivity.this, MainActivity.class);
                                startActivity(kitchen);
                                mActivityLoginBinding.editTextUsername.setText("");
                                mActivityLoginBinding.editTextPassword.setText("");
                                mActivityLoginBinding.progressBarLogin.setVisibility(View.INVISIBLE);
                            }
                        } else {
                            Toast.makeText(LoginActivity.this, "Password Mismatching,", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this, "Please check your username!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } else {
            Toast.makeText(this, "Username or Password cannot be empty.", Toast.LENGTH_SHORT).show();
        }
    }
}