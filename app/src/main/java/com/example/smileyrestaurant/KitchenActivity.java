package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KitchenActivity extends AppCompatActivity {

    ListView kitchenlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        kitchenlist = (ListView) findViewById(R.id.kitchen_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.kitchen_list_item);
        kitchenlist.setAdapter(arrayAdapter);

    }
}