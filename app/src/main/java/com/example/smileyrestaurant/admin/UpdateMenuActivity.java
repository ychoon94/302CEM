package com.example.smileyrestaurant.admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityUpdateMenuBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class UpdateMenuActivity extends AppCompatActivity {

    private ActivityUpdateMenuBinding mActivityUpdateMenuBinding;

    private DatabaseReference mDatabase;

    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10, spinner11;

    List<String> foodstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_menu);

        mActivityUpdateMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_update_menu);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("foodmenu").child("food1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname1.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price1 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food2").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname2.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price2 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food3").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname3.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price3 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food4").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname4.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price4 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food5").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname5.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price5 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food6").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname6.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price6 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food7").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname7.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price7 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food8").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityUpdateMenuBinding.textViewFoodname8.setText(foodname);
                        }
//                        if (data.getKey().equals("price")) {
//                            price8 = data.getValue().toString();
//                        }
                    }

                }
            }
        });

//      food status rtdb

        mDatabase.child("foodmenu").child("food1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textviewFoodstatus1.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price1 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food2").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textviewFoodstatus2.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price2 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food3").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textViewFoodstatus3.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price3 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food4").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textViewFoodstatus4.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price4 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food5").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textViewFoodstatus5.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price5 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food6").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textViewFoodstatus6.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price6 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food7").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textViewFoodstatus7.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price7 = data.getValue().toString();
//                        }
                    }
                }
            }
        });

        mDatabase.child("foodmenu").child("food8").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("status")) {
                            String foodstatus = data.getValue().toString();
                            if (foodstatus.equals("remove")){
                                mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
                                mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
                            }
                            mActivityUpdateMenuBinding.textViewFoodstatus8.setText(foodstatus);
                        }
//                        if (data.getKey().equals("price")) {
//                            price8 = data.getValue().toString();
//                        }
                    }

                }
            }
        });


        //Spinner intiation
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);
        spinner6 = findViewById(R.id.spinner6);
        spinner7 = findViewById(R.id.spinner7);
        spinner8 = findViewById(R.id.spinner8);
        spinner9 = findViewById(R.id.spinner9);
        spinner10 = findViewById(R.id.spinner10);
        spinner11 = findViewById(R.id.spinner11);

        foodstatus = new ArrayList<String>();
        foodstatus.add("visible");
        foodstatus.add("hide");
        foodstatus.add("remove");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, foodstatus);

        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner1.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter);
        spinner3.setAdapter(dataAdapter);
        spinner4.setAdapter(dataAdapter);
        spinner5.setAdapter(dataAdapter);
        spinner6.setAdapter(dataAdapter);
        spinner7.setAdapter(dataAdapter);
        spinner8.setAdapter(dataAdapter);
        spinner9.setAdapter(dataAdapter);
        spinner10.setAdapter(dataAdapter);
        spinner11.setAdapter(dataAdapter);


    }

    public void addnewfood(View view) {
        Intent addnewfood = new Intent(UpdateMenuActivity.this, AddNewMenuActivity.class);
        startActivity(addnewfood);
    }

    public void savechange1(View view) {
        String text = spinner1.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food1").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner1.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname1.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textviewFoodstatus1.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner1.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange1.setVisibility(View.GONE);
        }
    }

    public void savechange2(View view) {
        String text = spinner2.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food2").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname2.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textviewFoodstatus2.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner2.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange2.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname2.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textviewFoodstatus2.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner2.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange2.setVisibility(View.GONE);
        }
    }

    public void savechange3(View view) {
        String text = spinner3.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food3").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname3.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus3.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner3.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange3.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname3.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus3.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner3.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange3.setVisibility(View.GONE);
        }
    }

    public void savechange4(View view) {
        String text = spinner4.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food4").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname4.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus4.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner4.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange4.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname4.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus4.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner4.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange4.setVisibility(View.GONE);
        }
    }

    public void savechange5(View view) {
        String text = spinner5.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food5").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname5.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus5.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner5.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange5.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname5.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus5.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner5.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange5.setVisibility(View.GONE);
        }
    }

    public void savechange6(View view) {
        String text = spinner6.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food6").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname6.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus6.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner6.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange6.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname6.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus6.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner6.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange6.setVisibility(View.GONE);
        }
    }

    public void savechange7(View view) {
        String text = spinner7.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food7").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname7.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus7.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner7.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange7.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname7.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus7.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner7.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange7.setVisibility(View.GONE);
        }
    }

    public void savechange8(View view) {
        String text = spinner8.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food8").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname8.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus8.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner8.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange8.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname8.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus8.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner8.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange8.setVisibility(View.GONE);
        }
    }

    public void savechange9(View view) {
        String text = spinner9.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food9").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname9.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus9.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner9.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange9.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname9.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus9.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner9.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange9.setVisibility(View.GONE);
        }
    }

    public void savechange10(View view) {
        String text = spinner10.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food10").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname10.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus10.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner10.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange10.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname10.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus10.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner10.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange10.setVisibility(View.GONE);
        }
    }

    public void savechange11(View view) {
        String text = spinner11.getSelectedItem().toString();
        mDatabase.child("foodmenu").child("food11").child("status").setValue(text);
        if (text.equals("visible") || text.equals("hide")){
            mActivityUpdateMenuBinding.textViewFoodname11.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.textViewFoodstatus11.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.spinner11.setVisibility(View.VISIBLE);
            mActivityUpdateMenuBinding.buttonSavechange11.setVisibility(View.VISIBLE);

        } else if (text.equals("remove")){
            mActivityUpdateMenuBinding.textViewFoodname11.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.textViewFoodstatus11.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.spinner11.setVisibility(View.GONE);
            mActivityUpdateMenuBinding.buttonSavechange11.setVisibility(View.GONE);
        }
    }
}