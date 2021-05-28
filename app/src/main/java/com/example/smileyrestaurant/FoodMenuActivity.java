package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.example.smileyrestaurant.databinding.ActivityFoodMenuBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FoodMenuActivity extends AppCompatActivity {

    private ActivityFoodMenuBinding mActivityFoodMenuBinding;
//    SharedPreferences mSharedPreferences;
    private String tablename;

    private DatabaseReference mDatabase;

    public static final String MyTABLE = "MyTable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        mActivityFoodMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_food_menu);

        tablename = getIntent().getStringExtra("table");

        mDatabase = FirebaseDatabase.getInstance().getReference();

//        final DatabaseReference foodmenuref = mDatabase.child("foodmenu");
//
//        foodmenuref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot snapshot) {
//                for (DataSnapshot data : snapshot.getChildren()) {
//                    if (data.getKey().equals("name")){
//                        String foodname = data.getValue().toString();
//                        mActivityFoodMenuBinding.buttonFood1.setText(foodname);
//                    }
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//
//            }
//        });

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
                            mActivityFoodMenuBinding.buttonFood1.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood2.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood3.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood4.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood5.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood6.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood7.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
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
                            mActivityFoodMenuBinding.buttonFood8.setText(foodname);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

//        mActivityFoodMenuBinding.buttonFood1.setText();

//        mDatabase.child("foodmenu").child("food1").child("name").setValue("Hawaiian Pizza");
//        mDatabase.child("foodmenu").child("food1").child("price").setValue("19.00");
//
//        mDatabase.child("foodmenu").child("food2").child("name").setValue("Chickensaurus Pizza");
//        mDatabase.child("foodmenu").child("food2").child("price").setValue("15.00");
//
//        mDatabase.child("foodmenu").child("food3").child("name").setValue("BBQ Pizza");
//        mDatabase.child("foodmenu").child("food3").child("price").setValue("18.00");
//
//        mDatabase.child("foodmenu").child("food4").child("name").setValue("Supreme Pizza");
//        mDatabase.child("foodmenu").child("food4").child("price").setValue("30.00");
//
//        mDatabase.child("foodmenu").child("food5").child("name").setValue("Mushroom Pizza");
//        mDatabase.child("foodmenu").child("food5").child("price").setValue("13.00");
//
//        mDatabase.child("foodmenu").child("food6").child("name").setValue("Tuna Pizza");
//        mDatabase.child("foodmenu").child("food6").child("price").setValue("20.00");
//
//        mDatabase.child("foodmenu").child("food7").child("name").setValue("Cheese Pizza");
//        mDatabase.child("foodmenu").child("food7").child("price").setValue("10.00");
//
//        mDatabase.child("foodmenu").child("food8").child("name").setValue("Pepperoni Pizza");
//        mDatabase.child("foodmenu").child("food8").child("price").setValue("25.00");


//        mActivityFoodMenuBinding.textView.setText(tablename);
    }

}