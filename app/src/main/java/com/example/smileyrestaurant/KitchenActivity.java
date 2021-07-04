package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KitchenActivity extends AppCompatActivity {

    private static final String TAG = "Kitchen";
    List<OrderPlaced> orderPlacedList = new ArrayList<OrderPlaced>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ImageView btnReady;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        createdOrderPlacedList();
        Log.d(TAG, "onCreate: " + orderPlacedList.toString());
        Toast.makeText(this, "Order list count: "+ orderPlacedList.size(), Toast.LENGTH_SHORT).show();

        recyclerView = findViewById(R.id.kitchen_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecyclerViewAdapter(orderPlacedList, KitchenActivity.this);
        recyclerView.setAdapter(mAdapter);
    }

    private void createdOrderPlacedList() {
        OrderPlaced op1 = new OrderPlaced(1,"12:00", 3, 5, 5, "Hawaiian Pizza");
        OrderPlaced op2 = new OrderPlaced(2,"13:10", 5, 1, 1, "Pepperoni Pizza");
        orderPlacedList.addAll(Arrays.asList(new OrderPlaced[] {op1, op2}));
    }
};