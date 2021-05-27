package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smileyrestaurant.databinding.ActivityChooseTableBinding;

public class ChooseTableActivity extends AppCompatActivity {

    private ActivityChooseTableBinding mActivityChooseTableBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_table);

        mActivityChooseTableBinding = DataBindingUtil.setContentView(this, R.layout.activity_choose_table);

    }

    public void menu1(View view) {
        String tablename1 = mActivityChooseTableBinding.buttonTable1.getText().toString();
        Intent menu1 = new Intent (this, FoodMenuActivity.class);
        menu1.putExtra("table", tablename1);
        startActivity(menu1);
    }

    public void menu2(View view) {
        String tablename2 = mActivityChooseTableBinding.buttonTable2.getText().toString();
        Intent menu2 = new Intent (this, FoodMenuActivity.class);
        menu2.putExtra("table", tablename2);
        startActivity(menu2);
    }

    public void menu3(View view) {
        String tablename3 = mActivityChooseTableBinding.buttonTable3.getText().toString();
        Intent menu3 = new Intent (this, FoodMenuActivity.class);
        menu3.putExtra("table", tablename3);
        startActivity(menu3);
    }

    public void menu4(View view) {
        String tablename4 = mActivityChooseTableBinding.buttonTable4.getText().toString();
        Intent menu4 = new Intent (this, FoodMenuActivity.class);
        menu4.putExtra("table", tablename4);
        startActivity(menu4);
    }

    public void menu5(View view) {
        String tablename5 = mActivityChooseTableBinding.buttonTable5.getText().toString();
        Intent menu5 = new Intent (this, FoodMenuActivity.class);
        menu5.putExtra("table", tablename5);
        startActivity(menu5);
    }

    public void menu6(View view) {
        String tablename6 = mActivityChooseTableBinding.buttonTable6.getText().toString();
        Intent menu6 = new Intent (this, FoodMenuActivity.class);
        menu6.putExtra("table", tablename6);
        startActivity(menu6);
    }

    public void menu7(View view) {
        String tablename7 = mActivityChooseTableBinding.buttonTable7.getText().toString();
        Intent menu7 = new Intent (this, FoodMenuActivity.class);
        menu7.putExtra("table", tablename7);
        startActivity(menu7);
    }

    public void menu8(View view) {
        String tablename8 = mActivityChooseTableBinding.buttonTable8.getText().toString();
        Intent menu8 = new Intent (this, FoodMenuActivity.class);
        menu8.putExtra("table", tablename8);
        startActivity(menu8);
    }

    public void menu9(View view) {
        String tablename9 = mActivityChooseTableBinding.buttonTable9.getText().toString();
        Intent menu9 = new Intent (this, FoodMenuActivity.class);
        menu9.putExtra("table", tablename9);
        startActivity(menu9);
    }

    public void menu10(View view) {
        String tablename10 = mActivityChooseTableBinding.buttonTable10.getText().toString();
        Intent menu10 = new Intent (this, FoodMenuActivity.class);
        menu10.putExtra("table", tablename10);
        startActivity(menu10);
    }
}