package com.example.smileyrestaurant.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityAdminBinding;

public class AdminActivity extends AppCompatActivity {

    ActivityAdminBinding mActivityAdminBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void manageStaff(View view) {
        Intent managestaff = new Intent(AdminActivity.this, AccountActivity.class);
        startActivity(managestaff);
    }

    public void manageMenuListing(View view) {
        Intent manageMenu = new Intent(AdminActivity.this, UpdateMenuActivity.class);
        startActivity(manageMenu);
    }
}