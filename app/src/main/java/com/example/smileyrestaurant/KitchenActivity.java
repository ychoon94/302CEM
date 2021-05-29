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


    }


}