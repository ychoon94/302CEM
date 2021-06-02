package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(v -> {
            Intent intent1 = new Intent(Homepage.this,AddOrder.class);
            startActivity(intent1);
        });

        button2.setOnClickListener(v -> {
            Intent intent2 = new Intent(Homepage.this, Kitchen.class);
            startActivity(intent2);
        });
    }
}