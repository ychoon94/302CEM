package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        mActivityKitchenBinding = DataBindingUtil.setContentView(this, R.layout.activity_kitchen);

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

        Log.d("HELLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOO", ordertime1);
        Log.d("HELLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOO", foodname1);


        if (status1.equals("placed")){
            mActivityKitchenBinding.textViewOrdertime1.setText(ordertime1);
            mActivityKitchenBinding.textviewFoodname1.setText(foodname1);
            mActivityKitchenBinding.textViewFoodname2.setText(foodname2);
            mActivityKitchenBinding.textViewFoodname3.setText(foodname3);
            mActivityKitchenBinding.textViewQuantity1.setText(quantity1);
            mActivityKitchenBinding.textViewQuantity2.setText(quantity2);
            mActivityKitchenBinding.textViewQuantity3.setText(quantity3);

            mActivityKitchenBinding.textViewOrdertime2.setText(ordertime2);
            mActivityKitchenBinding.textViewFoodname4.setText(foodname4);
            mActivityKitchenBinding.textViewFoodname5.setText(foodname5);
            mActivityKitchenBinding.textViewFoodname6.setText(foodname6);
            mActivityKitchenBinding.textViewQuantity4.setText(quantity4);
            mActivityKitchenBinding.textViewQuantity5.setText(quantity5);
            mActivityKitchenBinding.textViewQuantity6.setText(quantity6);
        }

    }


}