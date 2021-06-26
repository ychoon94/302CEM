package com.example.smileyrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;


public class LoginActivity extends AppCompatActivity {
    private Button mLoginButton;
    private EditText mUsernameField, mPasswordField;
    List<Staff> Staff_LIST;
    FirebaseFirestore db;

    public static  final  String COLLECTION_NAME_KEY = "STAFFS";
    public static  final  String USERNAME_KEY = "Email";
    public static  final  String PASSWORD_KEY = "Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = FirebaseFirestore.getInstance(); //store data

        mLoginButton = findViewById(R.id.login_button);
        mUsernameField = findViewById(R.id.username_edit_text);
        mPasswordField = findViewById(R.id.password_edit_text);

        //Start Login Activity
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(login);
            }
        });

        //Flow of the login
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mUsernameField.getText().toString().equals("")
                        && !mPasswordField.getText().toString().equals("")) {
                    DocumentReference docRef = db.collection(COLLECTION_NAME_KEY).document(mUsernameField.getText().toString());
                    docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                            if (documentSnapshot.exists()) {
                                Staff staff = documentSnapshot.toObject(Staff.class);

                                if (staff.getPassword().equals(mPasswordField.getText().toString())) {
                                    Toast.makeText(getApplicationContext(), "Welcome to Smiley Restaurant:)", Toast.LENGTH_SHORT).show();
                                    Intent main = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(main);
                                    //Show Password Mismatching text if the user input the wrong password
                                } else {
                                    Toast.makeText(LoginActivity.this, "Password Mismatching.", Toast.LENGTH_SHORT).show();
                                }

                                //Show Please check your username if the user input the wrong username
                            } else {
                                Toast.makeText(getApplicationContext(), "Please check your username! ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(LoginActivity.this, "Username or Password Cannot be Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
