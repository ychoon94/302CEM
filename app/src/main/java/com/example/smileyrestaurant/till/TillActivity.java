package com.example.smileyrestaurant.till;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityTillBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TillActivity extends AppCompatActivity {

    private ActivityTillBinding mActivityTillBinding;

    private DatabaseReference mDatabase;

    private String tableno, food1, food2, food3, quantity1, quantity2, quantity3, price1, price2, price3, total, change, payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_till);

        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public void paymentdone(View view) {

    }

    public void load_order1(View view) {

    }

    public void load_order2(View view) {

    }

    public void load_order3(View view) {

    }

    public void load_order4(View view) {

    }

    public void load_order5(View view) {

    }

    public void load_order6(View view) {
    }

    public void load_order7(View view) {
    }

    public void load_order8(View view) {
    }

    public void load_order9(View view) {
    }

    public void load_order10(View view) {
    }
}