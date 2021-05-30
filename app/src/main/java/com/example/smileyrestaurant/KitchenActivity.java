package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.example.smileyrestaurant.databinding.ActivityKitchenBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KitchenActivity extends AppCompatActivity {

    private ActivityKitchenBinding mActivityKitchenBinding;

    private String ordertime1, ordertime2, foodname1, foodname2, foodname3, foodname4, foodname5, foodname6, quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, status1, status2;

    private String placed;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        mActivityKitchenBinding = DataBindingUtil.setContentView(this, R.layout.activity_kitchen);

        mDatabase = FirebaseDatabase.getInstance().getReference();

//        mDatabase.child("orderlist").child("1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DataSnapshot> task) {
//                if (!task.isSuccessful()) {
//                    Log.e("firebase", "Error getting data", task.getException());
//                }
//                else {
//                    for (DataSnapshot data : task.getResult().getChildren()) {
//                        if (data.getKey().equals("ordertime")) {
//                            ordertime1 = data.getValue().toString();
//                        }
//                        if (data.getKey().equals("food")){
//                            for (DataSnapshot data1 : data.getChildren()){
//                                if (data1.getKey().equals("1")) {
//                                    Map<String, Object> td1 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values1 = new ArrayList<>(td1.values());
//                                    foodname1 = values1.get(2).toString();
//                                    quantity1 = values1.get(0).toString();
//                                }
//                                if (data1.getKey().equals("2")) {
//                                    Map<String, Object> td2 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values2 = new ArrayList<>(td2.values());
//                                    foodname2 = values2.get(2).toString();
//                                    quantity2 = values2.get(0).toString();
//                                }
//                                if (data1.getKey().equals("3")) {
//                                    Map<String, Object> td3 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values3 = new ArrayList<>(td3.values());
//                                    foodname3 = values3.get(2).toString();
//                                    quantity3 = values3.get(0).toString();
//                                }
//                                if (data1.getKey().equals("4")) {
//                                    Map<String, Object> td4 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values4 = new ArrayList<>(td4.values());
//                                    foodname1 = values4.get(2).toString();
//                                    quantity1 = values4.get(0).toString();
//                                }
//                                if (data1.getKey().equals("5")) {
//                                    Map<String, Object> td5 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values5 = new ArrayList<>(td5.values());
//                                    foodname2 = values5.get(2).toString();
//                                    quantity2 = values5.get(0).toString();
//                                }
//                                if (data1.getKey().equals("6")) {
//                                    Map<String, Object> td6 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values6 = new ArrayList<>(td6.values());
//                                    foodname3 = values6.get(2).toString();
//                                    quantity3 = values6.get(0).toString();
//                                }
//                                if (data1.getKey().equals("7")) {
//                                    Map<String, Object> td7 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values7 = new ArrayList<>(td7.values());
//                                    foodname1 = values7.get(2).toString();
//                                    quantity1 = values7.get(0).toString();
//                                }
//                                if (data1.getKey().equals("8")) {
//                                    Map<String, Object> td8 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values8 = new ArrayList<>(td8.values());
//                                    foodname2 = values8.get(2).toString();
//                                    quantity2 = values8.get(0).toString();
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        });

//        mDatabase.child("orderlist").child("2").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DataSnapshot> task) {
//                if (!task.isSuccessful()) {
//                    Log.e("firebase", "Error getting data", task.getException());
//                }
//                else {
//                    for (DataSnapshot data : task.getResult().getChildren()) {
//                        if (data.getKey().equals("ordertime")) {
//                            ordertime2 = data.getValue().toString();
//                        }
//                        if (data.getKey().equals("food")){
//                            for (DataSnapshot data1 : data.getChildren()){
//                                if (data1.getKey().equals("1")) {
//                                    Map<String, Object> td1 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values1 = new ArrayList<>(td1.values());
//                                    foodname1 = values1.get(2).toString();
//                                    quantity1 = values1.get(0).toString();
//                                }
//                                if (data1.getKey().equals("2")) {
//                                    Map<String, Object> td2 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values2 = new ArrayList<>(td2.values());
//                                    foodname2 = values2.get(2).toString();
//                                    quantity2 = values2.get(0).toString();
//                                }
//                                if (data1.getKey().equals("3")) {
//                                    Map<String, Object> td3 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values3 = new ArrayList<>(td3.values());
//                                    foodname3 = values3.get(2).toString();
//                                    quantity3 = values3.get(0).toString();
//                                }
//                                if (data1.getKey().equals("4")) {
//                                    Map<String, Object> td4 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values4 = new ArrayList<>(td4.values());
//                                    foodname1 = values4.get(2).toString();
//                                    quantity1 = values4.get(0).toString();
//                                }
//                                if (data1.getKey().equals("5")) {
//                                    Map<String, Object> td5 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values5 = new ArrayList<>(td5.values());
//                                    foodname2 = values5.get(2).toString();
//                                    quantity2 = values5.get(0).toString();
//                                }
//                                if (data1.getKey().equals("6")) {
//                                    Map<String, Object> td6 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values6 = new ArrayList<>(td6.values());
//                                    foodname3 = values6.get(2).toString();
//                                    quantity3 = values6.get(0).toString();
//                                }
//                                if (data1.getKey().equals("7")) {
//                                    Map<String, Object> td7 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values7 = new ArrayList<>(td7.values());
//                                    foodname1 = values7.get(2).toString();
//                                    quantity1 = values7.get(0).toString();
//                                }
//                                if (data1.getKey().equals("8")) {
//                                    Map<String, Object> td8 = (HashMap<String, Object>) data1.getValue();
//                                    List<Object> values8 = new ArrayList<>(td8.values());
//                                    foodname2 = values8.get(2).toString();
//                                    quantity2 = values8.get(0).toString();
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        });



        ordertime1 = getIntent().getStringExtra("ordertime1");
        foodname1 = getIntent().getStringExtra("foodname1");
        foodname2 = getIntent().getStringExtra("foodname2");
        foodname3 = getIntent().getStringExtra("foodname3");
        quantity1 = getIntent().getStringExtra("quantity1");
        quantity2 = getIntent().getStringExtra("quantity2");
        quantity3 = getIntent().getStringExtra("quantity3");
        status1 = getIntent().getStringExtra("status1");

        ordertime2 = getIntent().getStringExtra("ordertime2");
        foodname4 = getIntent().getStringExtra("foodname4");
        foodname5 = getIntent().getStringExtra("foodname5");
        foodname6 = getIntent().getStringExtra("foodname6");
        quantity4 = getIntent().getStringExtra("quantity4");
        quantity5 = getIntent().getStringExtra("quantity5");
        quantity6 = getIntent().getStringExtra("quantity6");
        status2 = getIntent().getStringExtra("status2");


        if (status1.equals("placed")) {

            mActivityKitchenBinding.textViewOrdertime1.setText(ordertime1);
            mActivityKitchenBinding.textviewFoodname1.setText(foodname1);
            mActivityKitchenBinding.textViewFoodname2.setText(foodname2);
            mActivityKitchenBinding.textViewFoodname3.setText(foodname3);
            mActivityKitchenBinding.textViewQuantity1.setText(quantity1);
            mActivityKitchenBinding.textViewQuantity2.setText(quantity2);
            mActivityKitchenBinding.textViewQuantity3.setText(quantity3);
        } else {
            mActivityKitchenBinding.linearlayout1.setVisibility(View.GONE);
            mActivityKitchenBinding.buttonReady1.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewOrdertime1.setVisibility(View.GONE);
            mActivityKitchenBinding.textviewFoodname1.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewFoodname2.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewFoodname3.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewQuantity1.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewQuantity2.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewQuantity3.setVisibility(View.GONE);

        }


        if (status2.equals("placed")) {
            mActivityKitchenBinding.textViewOrdertime2.setText(ordertime2);
            mActivityKitchenBinding.textViewFoodname4.setText(foodname4);
            mActivityKitchenBinding.textViewFoodname5.setText(foodname5);
            mActivityKitchenBinding.textViewFoodname6.setText(foodname6);
            mActivityKitchenBinding.textViewQuantity4.setText(quantity4);
            mActivityKitchenBinding.textViewQuantity5.setText(quantity5);
            mActivityKitchenBinding.textViewQuantity6.setText(quantity6);
        } else {
            mActivityKitchenBinding.linearlayout2.setVisibility(View.GONE);
            mActivityKitchenBinding.buttonReady2.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewOrdertime2.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewFoodname4.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewFoodname5.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewFoodname6.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewQuantity4.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewQuantity5.setVisibility(View.GONE);
            mActivityKitchenBinding.textViewQuantity6.setVisibility(View.GONE);
        }


    }


    public void gobackhome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void readyorder1(View view) {
        mDatabase.child("orderlist").child("1").child("status").setValue("ready");
        status1 = "ready";

        mActivityKitchenBinding.linearlayout1.setVisibility(View.GONE);
        mActivityKitchenBinding.buttonReady1.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewOrdertime1.setVisibility(View.GONE);
        mActivityKitchenBinding.textviewFoodname1.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewFoodname2.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewFoodname3.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewQuantity1.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewQuantity2.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewQuantity3.setVisibility(View.GONE);

//        finish();
//        overridePendingTransition(0,0);
//        startActivity(getIntent());
//        overridePendingTransition(0,0);
    }

    public void readyorder2(View view) {
        mDatabase.child("orderlist").child("2").child("status").setValue("ready");
        status2 = "ready";

        mActivityKitchenBinding.linearlayout2.setVisibility(View.GONE);
        mActivityKitchenBinding.buttonReady2.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewOrdertime2.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewFoodname4.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewFoodname5.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewFoodname6.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewQuantity4.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewQuantity5.setVisibility(View.GONE);
        mActivityKitchenBinding.textViewQuantity6.setVisibility(View.GONE);

//        finish();
//        overridePendingTransition(0,0);
//        startActivity(getIntent());
//        overridePendingTransition(0,0);
    }
}