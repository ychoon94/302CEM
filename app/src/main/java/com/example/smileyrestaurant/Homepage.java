package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {
    //function for add order/kitchen button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent1 = new Intent(Homepage.this,AddOrder.class);
            startActivity(intent1); //homepage -> add order screen
        });

    }
}