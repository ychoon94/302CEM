package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Integer ordernumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ordernumber = 0;
    }

    public void addOrder(View view) {
        Intent intent = new Intent(this, ChooseTableActivity.class);
        ordernumber = ordernumber + 1;
        intent.putExtra("ordernumber", ordernumber.toString());
        startActivity(intent);
    }

    public void kitchen(View view) {
    }
}