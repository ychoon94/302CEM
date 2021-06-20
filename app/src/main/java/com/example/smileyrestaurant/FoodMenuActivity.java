package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.smileyrestaurant.databinding.ActivityFoodMenuBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static android.view.View.GONE;

public class FoodMenuActivity extends AppCompatActivity {

    private ActivityFoodMenuBinding mActivityFoodMenuBinding;
//    SharedPreferences mSharedPreferences;
    private String tablename;
    private String ordernumber;

    private String price1,price2,price3,price4,price5,price6,price7,price8;
    private Integer count1,count2,count3,count4,count5,count6,count7,count8;
    private String table, food1_1, food2_2, food3_3;
    private Integer quantity1_1, quantity2_2, quantity3_3;
    private String price1_1, price2_2, price3_3;
    private String staffname, status;
    private String foodid1, foodid2, foodid3;

    private DatabaseReference mDatabase;

    public static final String MyTABLE = "MyTable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_food_menu);

        mActivityFoodMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_food_menu);

        tablename = getIntent().getStringExtra("table");
        ordernumber = getIntent().getStringExtra("ordernumber");

        count1 = 0;
        count2 = 0;
        count3 = 0;
//        count4 = 0;
//        count5 = 0;
//        count6 = 0;
//        count7 = 0;
//        count8 = 0;

        // will change during next sprint
        staffname = "tyc";
        status = "placed";
        table = tablename;

        mActivityFoodMenuBinding.textViewTablenumber1.setText(tablename);

        mDatabase = FirebaseDatabase.getInstance().getReference();


        mDatabase.child("foodmenu").child("food1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood1.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price1 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood1.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food2").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood2.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price2 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood2.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food3").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood3.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price3 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood3.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food4").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood4.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price4 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood4.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food5").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood5.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price5 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood5.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food6").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood6.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price6 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood6.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food7").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood7.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price7 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood7.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

        mDatabase.child("foodmenu").child("food8").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("visible")){
                            if (data.getKey().equals("name")) {
                                String foodname = data.getValue().toString();
                                mActivityFoodMenuBinding.buttonFood8.setText(foodname);
                            }
                            if (data.getKey().equals("price")) {
                                price8 = data.getValue().toString();
                            }
                        }else if (data.getKey().equals("hide") || data.getKey().equals("remove")){
                            mActivityFoodMenuBinding.buttonFood8.setVisibility(GONE);
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

    }


    public void confirmorder(View view) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
        Calendar c = Calendar.getInstance();
        String date = sdf.format(c.getTime());
        String time = sdf1.format(c.getTime());

        mDatabase.child("orderlist").child(ordernumber).child("orderdate").setValue(date);
        mDatabase.child("orderlist").child(ordernumber).child("ordertime").setValue(time);
        // this is to push to orderlist database when done is pressed
        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue(staffname);
        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid1).child("name").setValue(food1_1);
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid1).child("price").setValue(price1_1);
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid1).child("quantity").setValue(quantity1_1);

        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid2).child("name").setValue(food2_2);
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid2).child("price").setValue(price2_2);
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid2).child("quantity").setValue(quantity2_2);

        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid3).child("name").setValue(food3_3);
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid3).child("price").setValue(price3_3);
        mDatabase.child("orderlist").child(ordernumber).child("food").child(foodid3).child("quantity").setValue(quantity3_3);


        //kitchen database set ######################
        mDatabase.child("kitchen").child(ordernumber).child("ordertime").setValue(time);
        mDatabase.child("kitchen").child(ordernumber).child("ordernumber").setValue(ordernumber);

        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid1).child("name").setValue(food1_1);
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid1).child("quantity").setValue(quantity1_1);
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid1).child("status").setValue("placed");
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid1).child("foodid").setValue(foodid1);

        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid2).child("name").setValue(food2_2);
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid2).child("quantity").setValue(quantity2_2);
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid2).child("status").setValue("placed");
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid2).child("foodid").setValue(foodid2);

        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid3).child("name").setValue(food3_3);
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid3).child("quantity").setValue(quantity3_3);
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid3).child("status").setValue("placed");
        mDatabase.child("kitchen").child(ordernumber).child("food").child(foodid3).child("foodid").setValue(foodid3);
        //bills database set for tills
        mDatabase.child("bills").child(tablename).child(foodid1).child("name").setValue(food1_1);
        mDatabase.child("bills").child(tablename).child(foodid1).child("price").setValue(price1_1);
        mDatabase.child("bills").child(tablename).child(foodid1).child("quantity").setValue(quantity1_1);

        mDatabase.child("bills").child(tablename).child(foodid2).child("name").setValue(food2_2);
        mDatabase.child("bills").child(tablename).child(foodid2).child("price").setValue(price2_2);
        mDatabase.child("bills").child(tablename).child(foodid2).child("quantity").setValue(quantity2_2);

        mDatabase.child("bills").child(tablename).child(foodid3).child("name").setValue(food3_3);
        mDatabase.child("bills").child(tablename).child(foodid3).child("price").setValue(price3_3);
        mDatabase.child("bills").child(tablename).child(foodid3).child("quantity").setValue(quantity3_3);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void addtoorder1(View view) {
        count1 = count1 + 1;

        food1_1 = mActivityFoodMenuBinding.buttonFood1.getText().toString();
        price1_1 = price1;
        quantity1_1 = count1;
        foodid1 = "1";

        mActivityFoodMenuBinding.textviewFoodname1.setText(food1_1);
        mActivityFoodMenuBinding.textViewQuantity1.setText(String.valueOf(quantity1_1));
        mActivityFoodMenuBinding.textviewFoodname1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove1.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("1").child("name").setValue(mActivityFoodMenuBinding.buttonFood1.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("1").child("price").setValue(price1);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("1").child("quantity").setValue(count1);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("1").child("name").setValue(mActivityFoodMenuBinding.buttonFood1.getText().toString());
//        mDatabase.child("bills").child(tablename).child("1").child("price").setValue(price1);
//        mDatabase.child("bills").child(tablename).child("1").child("quantity").setValue(count1);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("1").child("name").setValue(mActivityFoodMenuBinding.buttonFood1.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("1").child("quantity").setValue(count1);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("1").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("1").child("foodid").setValue("1");
    }

    public void addtoorder2(View view) {
        count2 = count2 + 1;

        food2_2 = mActivityFoodMenuBinding.buttonFood2.getText().toString();
        price2_2 = price2;
        quantity2_2 = count2;
        foodid2 = "2";

        mActivityFoodMenuBinding.textViewFoodname2.setText(food2_2);
        mActivityFoodMenuBinding.textViewQuantity2.setText(String.valueOf(quantity2_2));
        mActivityFoodMenuBinding.textViewFoodname2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove2.setVisibility(View.VISIBLE);


//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("2").child("name").setValue(mActivityFoodMenuBinding.buttonFood2.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("2").child("price").setValue(price2);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("2").child("quantity").setValue(count2);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("2").child("name").setValue(mActivityFoodMenuBinding.buttonFood2.getText().toString());
//        mDatabase.child("bills").child(tablename).child("2").child("price").setValue(price2);
//        mDatabase.child("bills").child(tablename).child("2").child("quantity").setValue(count2);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("2").child("name").setValue(mActivityFoodMenuBinding.buttonFood2.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("2").child("quantity").setValue(count2);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("2").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("2").child("foodid").setValue("2");

    }

    public void addtoorder3(View view) {
        count3 = count3 + 1;

        food3_3 = mActivityFoodMenuBinding.buttonFood3.getText().toString();
        price3_3 = price3;
        quantity3_3 = count3;
        foodid3 = "3";

        mActivityFoodMenuBinding.textViewFoodname3.setText(food3_3);
        mActivityFoodMenuBinding.textViewQuantity3.setText(String.valueOf(quantity3_3));
        mActivityFoodMenuBinding.textViewFoodname3.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity3.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd3.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove3.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("3").child("name").setValue(mActivityFoodMenuBinding.buttonFood3.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("3").child("price").setValue(price3);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("3").child("quantity").setValue(count3);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("3").child("name").setValue(mActivityFoodMenuBinding.buttonFood3.getText().toString());
//        mDatabase.child("bills").child(tablename).child("3").child("price").setValue(price3);
//        mDatabase.child("bills").child(tablename).child("3").child("quantity").setValue(count3);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("3").child("name").setValue(mActivityFoodMenuBinding.buttonFood3.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("3").child("quantity").setValue(count3);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("3").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("3").child("foodid").setValue("3");

    }

    public void addtoorder4(View view) {
        count1 = count1 + 1;

        food1_1 = mActivityFoodMenuBinding.buttonFood4.getText().toString();
        price1_1 = price4;
        quantity1_1 = count1;
        foodid1 = "4";

        mActivityFoodMenuBinding.textviewFoodname1.setText(food1_1);
        mActivityFoodMenuBinding.textViewQuantity1.setText(String.valueOf(quantity1_1));
        mActivityFoodMenuBinding.textviewFoodname1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove1.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("4").child("name").setValue(mActivityFoodMenuBinding.buttonFood4.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("4").child("price").setValue(price4);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("4").child("quantity").setValue(count4);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("4").child("name").setValue(mActivityFoodMenuBinding.buttonFood4.getText().toString());
//        mDatabase.child("bills").child(tablename).child("4").child("price").setValue(price4);
//        mDatabase.child("bills").child(tablename).child("4").child("quantity").setValue(count1);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("4").child("name").setValue(mActivityFoodMenuBinding.buttonFood4.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("4").child("quantity").setValue(count1);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("4").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("4").child("foodid").setValue("4");

    }

    public void addtoorder5(View view) {
        count2 = count2 + 1;

        food2_2 = mActivityFoodMenuBinding.buttonFood5.getText().toString();
        price2_2 = price5;
        quantity2_2 = count2;
        foodid2 = "5";

        mActivityFoodMenuBinding.textViewFoodname2.setText(food2_2);
        mActivityFoodMenuBinding.textViewQuantity2.setText(String.valueOf(quantity2_2));
        mActivityFoodMenuBinding.textViewFoodname2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove2.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("5").child("name").setValue(mActivityFoodMenuBinding.buttonFood5.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("5").child("price").setValue(price5);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("5").child("quantity").setValue(count5);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("5").child("name").setValue(mActivityFoodMenuBinding.buttonFood5.getText().toString());
//        mDatabase.child("bills").child(tablename).child("5").child("price").setValue(price5);
//        mDatabase.child("bills").child(tablename).child("5").child("quantity").setValue(count2);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("5").child("name").setValue(mActivityFoodMenuBinding.buttonFood5.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("5").child("quantity").setValue(count2);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("5").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("5").child("foodid").setValue("5");
    }

    public void addtoorder6(View view) {
        count3 = count3 + 1;

        food3_3 = mActivityFoodMenuBinding.buttonFood6.getText().toString();
        price3_3 = price6;
        quantity3_3 = count3;
        foodid3 = "6";

        mActivityFoodMenuBinding.textViewFoodname3.setText(food3_3);
        mActivityFoodMenuBinding.textViewQuantity3.setText(String.valueOf(quantity3_3));
        mActivityFoodMenuBinding.textViewFoodname3.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity3.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd3.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove3.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("6").child("name").setValue(mActivityFoodMenuBinding.buttonFood6.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("6").child("price").setValue(price6);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("6").child("quantity").setValue(count6);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("6").child("name").setValue(mActivityFoodMenuBinding.buttonFood6.getText().toString());
//        mDatabase.child("bills").child(tablename).child("6").child("price").setValue(price6);
//        mDatabase.child("bills").child(tablename).child("6").child("quantity").setValue(count3);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("6").child("name").setValue(mActivityFoodMenuBinding.buttonFood6.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("6").child("quantity").setValue(count3);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("6").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("6").child("foodid").setValue("6");

    }

    public void addtoorder7(View view) {
        count1 = count1 + 1;

        food1_1 = mActivityFoodMenuBinding.buttonFood7.getText().toString();
        price1_1 = price7;
        quantity1_1 = count1;
        foodid1 = "7";

        mActivityFoodMenuBinding.textviewFoodname1.setText(food1_1);
        mActivityFoodMenuBinding.textViewQuantity1.setText(String.valueOf(quantity1_1));
        mActivityFoodMenuBinding.textviewFoodname1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd1.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove1.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("7").child("name").setValue(mActivityFoodMenuBinding.buttonFood7.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("7").child("price").setValue(price7);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("7").child("quantity").setValue(count7);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("7").child("name").setValue(mActivityFoodMenuBinding.buttonFood7.getText().toString());
//        mDatabase.child("bills").child(tablename).child("7").child("price").setValue(price7);
//        mDatabase.child("bills").child(tablename).child("7").child("quantity").setValue(count1);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("7").child("name").setValue(mActivityFoodMenuBinding.buttonFood7.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("7").child("quantity").setValue(count1);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("7").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("7").child("foodid").setValue("7");
    }

    public void addtoorder8(View view) {
        count2 = count2 + 1;

        food2_2 = mActivityFoodMenuBinding.buttonFood8.getText().toString();
        price2_2 = price8;
        quantity2_2 = count2;
        foodid2 = "8";

        mActivityFoodMenuBinding.textViewFoodname2.setText(food2_2);
        mActivityFoodMenuBinding.textViewQuantity2.setText(String.valueOf(quantity2_2));
        mActivityFoodMenuBinding.textViewFoodname2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.textViewQuantity2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonAdd2.setVisibility(View.VISIBLE);
        mActivityFoodMenuBinding.buttonRemove2.setVisibility(View.VISIBLE);

//        mDatabase.child("orderlist").child(ordernumber).child("staff name").setValue("tyc");
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("8").child("name").setValue(mActivityFoodMenuBinding.buttonFood8.getText().toString());
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("8").child("price").setValue(price8);
//        mDatabase.child("orderlist").child(ordernumber).child("food").child("8").child("quantity").setValue(count8);
//        mDatabase.child("orderlist").child(ordernumber).child("tablenumber").setValue(tablename);
//        mDatabase.child("orderlist").child(ordernumber).child("status").setValue("placed");
        // new database for cashier ################################
//        mDatabase.child("bills").child(tablename).child("8").child("name").setValue(mActivityFoodMenuBinding.buttonFood8.getText().toString());
//        mDatabase.child("bills").child(tablename).child("8").child("price").setValue(price8);
//        mDatabase.child("bills").child(tablename).child("8").child("quantity").setValue(count2);
//        // new database for kitchen ##################################
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("8").child("name").setValue(mActivityFoodMenuBinding.buttonFood8.getText().toString());
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("8").child("quantity").setValue(count2);
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("8").child("status").setValue("placed");
//        mDatabase.child("kitchen").child(ordernumber).child("food").child("8").child("foodid").setValue("8");
    }

    public void addtoorder9(View view) {
    }

    public void addtoorder10(View view) {
    }


    public void addfood1(View view) {
        quantity1_1 = quantity1_1 + 1;
        count1 = quantity1_1;
        mActivityFoodMenuBinding.textViewQuantity1.setText(String.valueOf(quantity1_1));
    }

    public void addfood2(View view) {
        quantity2_2 = quantity2_2 + 1;
        count2 = quantity2_2;
        mActivityFoodMenuBinding.textViewQuantity2.setText(String.valueOf(quantity2_2));
    }

    public void addfood3(View view) {
        quantity3_3 = quantity3_3 + 1;
        count3 = quantity3_3;
        mActivityFoodMenuBinding.textViewQuantity3.setText(String.valueOf(quantity3_3));
    }

    public void removefood1(View view) {
        quantity1_1 = quantity1_1 - 1;
        count1 = quantity1_1;
        mActivityFoodMenuBinding.textViewQuantity1.setText(String.valueOf(quantity1_1));
        if (quantity1_1 <= 0){
            mActivityFoodMenuBinding.buttonAdd1.setVisibility(GONE);
            mActivityFoodMenuBinding.buttonRemove1.setVisibility(GONE);
            mActivityFoodMenuBinding.textViewQuantity1.setText(" ");
            mActivityFoodMenuBinding.textViewQuantity1.setVisibility(GONE);
            mActivityFoodMenuBinding.textviewFoodname1.setText(" ");
            mActivityFoodMenuBinding.textviewFoodname1.setVisibility(GONE);
        }
    }

    public void removefood2(View view) {
        quantity2_2 = quantity2_2 - 1;
        count2 = quantity2_2;
        mActivityFoodMenuBinding.textViewQuantity2.setText(String.valueOf(quantity2_2));
        if (quantity2_2 <= 0){
            mActivityFoodMenuBinding.buttonAdd2.setVisibility(GONE);
            mActivityFoodMenuBinding.buttonRemove2.setVisibility(GONE);
            mActivityFoodMenuBinding.textViewQuantity2.setText(" ");
            mActivityFoodMenuBinding.textViewQuantity2.setVisibility(GONE);
            mActivityFoodMenuBinding.textViewFoodname2.setText(" ");
            mActivityFoodMenuBinding.textViewFoodname2.setVisibility(GONE);
        }
    }

    public void removefood3(View view) {
        quantity3_3 = quantity3_3 - 1 ;
        count3 = quantity3_3;
        mActivityFoodMenuBinding.textViewQuantity3.setText(String.valueOf(quantity3_3));
        if (quantity3_3 <= 0){
            mActivityFoodMenuBinding.buttonAdd3.setVisibility(GONE);
            mActivityFoodMenuBinding.buttonRemove3.setVisibility(GONE);
            mActivityFoodMenuBinding.textViewQuantity3.setText(" ");
            mActivityFoodMenuBinding.textViewQuantity3.setVisibility(GONE);
            mActivityFoodMenuBinding.textViewFoodname3.setText(" ");
            mActivityFoodMenuBinding.textViewFoodname3.setVisibility(GONE);
        }
    }
}