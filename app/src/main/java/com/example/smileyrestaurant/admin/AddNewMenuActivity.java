package com.example.smileyrestaurant.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityAddNewMenuBinding;
import com.example.smileyrestaurant.databinding.ActivityUpdateMenuBinding;

import java.util.ArrayList;
import java.util.List;

public class AddNewMenuActivity extends AppCompatActivity {

    ActivityAddNewMenuBinding mActivityAddNewMenu;

    Spinner spinner;

    List<String> menuvisibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_menu);

        mActivityAddNewMenu = DataBindingUtil.setContentView(this, R.layout.activity_add_new_menu);

        spinner = findViewById(R.id.spinner_menuvisibility);

        menuvisibility = new ArrayList<String>();
        menuvisibility.add("visible");
        menuvisibility.add("hide");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, menuvisibility);

        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
    }

    public void savenewmenuitem(View view) {
    }
}