package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectTableActivity extends AppCompatActivity {
    private ImageView mHomeIV, mOneIV, mSecondIV, mThreeIV, mFourIV, mFiveIV,
            mSixIV, mSevenIV, mEightIV, mNineIV, mTenIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_table);

        mHomeIV = findViewById(R.id.home_IV);
        mOneIV = findViewById(R.id.one_IV);
        mSecondIV= findViewById(R.id.second_IV);
        mThreeIV = findViewById(R.id.three_IV);
        mFourIV= findViewById(R.id.four_IV);
        mFiveIV = findViewById(R.id.five_IV);
        mSixIV= findViewById(R.id.six_IV);
        mSevenIV = findViewById(R.id.second_IV);
        mEightIV= findViewById(R.id.eight_IV);
        mNineIV = findViewById(R.id.nine_IV);
        mTenIV= findViewById(R.id.ten_IV);


        mHomeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(SelectTableActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        // Set intent for each of the button to food selection screen
        mOneIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mSecondIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mThreeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mFourIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mFiveIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mSixIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mSevenIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mEightIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mNineIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

        mTenIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodSelect = new Intent(SelectTableActivity.this, FoodSelectionActivity.class);
                startActivity(foodSelect);
            }
        });

    }
}