package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


public class RegisterActivity extends AppCompatActivity {
    private Button mRegisterButton;
    private EditText mUsername1Field, mPassword1Field;
    private View mView;
    FirebaseAuth fAuth;
    FirebaseFirestore db;

    public static  final  String COLLECTION_NAME_KEY = "STAFFS";
    public static  final  String USERNAME_KEY = "Email";
    public static  final  String PASSWORD_KEY = "Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = FirebaseFirestore.getInstance();

        mRegisterButton = findViewById(R.id.register_button);
        mUsername1Field = findViewById(R.id.username1_edit_text);
        mPassword1Field= findViewById(R.id.password1_edit_text);

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(register);
            }
        });

        db = FirebaseFirestore.getInstance();

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsername1Field.getText().toString().trim();
                String pwd = mPassword1Field.getText().toString().trim();

                if(TextUtils.isEmpty(username)){
                    mUsername1Field.setError("Please enter an email address");
                    return;
                }

                if(TextUtils.isEmpty(pwd)){
                    mPassword1Field.setError("Please enter the password");
                    return;
                }

                if(pwd.length() > 9){
                    mPassword1Field.setError("Password must be <= 8 characters");
                    return;
                }

                else if (!mUsername1Field.getText().toString().equals("")
                        && !mPassword1Field.getText().toString().equals("")){
                    CollectionReference cities = db.collection(COLLECTION_NAME_KEY);
                    final Staff staffs = new Staff();

                    staffs.setUsername(mUsername1Field.getText().toString());
                    staffs.setPassword(mPassword1Field.getText().toString());

                    db.collection(COLLECTION_NAME_KEY).document(mUsername1Field.getText().toString()).set(staffs);

                    DocumentReference docRef = db.collection(COLLECTION_NAME_KEY).document();

                    docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            if (documentSnapshot.exists()) {
                                Toast.makeText(RegisterActivity.this,
                                        "All ready registered",
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                staffs.setUsername(mUsername1Field.getText().toString());
                                staffs.setPassword(mPassword1Field.getText().toString());
                                db.collection(COLLECTION_NAME_KEY).document(mUsername1Field.getText().toString()).set(staffs);

                                Toast.makeText(RegisterActivity.this, "Registration Successfully", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                } else {
                    Toast.makeText(getApplicationContext(), "Make All field Filled", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

