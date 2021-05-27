package com.example.smileyrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.smileyrestaurant.databinding.ActivityFoodMenuBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FoodMenuActivity extends AppCompatActivity {

    private ActivityFoodMenuBinding mActivityFoodMenuBinding;
//    SharedPreferences mSharedPreferences;
    private String tablename;

    private DatabaseReference mDatabase;

    public static final String MyTABLE = "MyTable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        mActivityFoodMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_food_menu);

        tablename = getIntent().getStringExtra("table");

        mDatabase = FirebaseDatabase.getInstance().getReference();



//        mDatabase.child("foodmenu").child("food1").child("Hawaiian Pizza").setValue("19.00");
//        mDatabase.child("foodmenu").child("food2").child("Chickensaurus Pizza").setValue("15.00");
//        mDatabase.child("foodmenu").child("food3").child("BBQ Pizza").setValue("18.00");
//        mDatabase.child("foodmenu").child("food4").child("Supreme Pizza").setValue("30.00");
//        mDatabase.child("foodmenu").child("food5").child("Mushroom Pizza").setValue("13.00");
//        mDatabase.child("foodmenu").child("food6").child("Tuna Pizza").setValue("20.00");
//        mDatabase.child("foodmenu").child("food7").child("Cheese Pizza").setValue("10.00");
//        mDatabase.child("foodmenu").child("food8").child("Pepperoni Pizza").setValue("25.00");

//        mActivityFoodMenuBinding.textView.setText(tablename);
    }

}