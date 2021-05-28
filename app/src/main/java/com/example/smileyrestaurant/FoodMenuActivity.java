package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

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

public class FoodMenuActivity extends AppCompatActivity {

    private ActivityFoodMenuBinding mActivityFoodMenuBinding;
//    SharedPreferences mSharedPreferences;
    private String tablename;
    private String ordernumber;

    private String price1,price2,price3,price4,price5,price6,price7,price8;

    private Integer count1,count2,count3,count4,count5,count6,count7,count8;

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
        count4 = 0;
        count5 = 0;
        count6 = 0;
        count7 = 0;
        count8 = 0;

        mDatabase = FirebaseDatabase.getInstance().getReference();


        mDatabase.child("foodmenu").child("food1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood1.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price1 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood2.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price2 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood3.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price3 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood4.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price4 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood5.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price5 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood6.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price6 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood7.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price7 = data.getValue().toString();
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
                        if (data.getKey().equals("name")) {
                            String foodname = data.getValue().toString();
                            mActivityFoodMenuBinding.buttonFood8.setText(foodname);
                        }
                        if (data.getKey().equals("price")) {
                            price8 = data.getValue().toString();
                        }
                    }

//                    mActivityFoodMenuBinding.buttonFood1.setText(task.getResult().getValue().toString());
//                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                }
            }
        });

//        mActivityFoodMenuBinding.buttonFood1.setText();

//        mDatabase.child("foodmenu").child("food1").child("name").setValue("Hawaiian Pizza");
//        mDatabase.child("foodmenu").child("food1").child("price").setValue("19.00");
//
//        mDatabase.child("foodmenu").child("food2").child("name").setValue("Chickensaurus Pizza");
//        mDatabase.child("foodmenu").child("food2").child("price").setValue("15.00");
//
//        mDatabase.child("foodmenu").child("food3").child("name").setValue("BBQ Pizza");
//        mDatabase.child("foodmenu").child("food3").child("price").setValue("18.00");
//
//        mDatabase.child("foodmenu").child("food4").child("name").setValue("Supreme Pizza");
//        mDatabase.child("foodmenu").child("food4").child("price").setValue("30.00");
//
//        mDatabase.child("foodmenu").child("food5").child("name").setValue("Mushroom Pizza");
//        mDatabase.child("foodmenu").child("food5").child("price").setValue("13.00");
//
//        mDatabase.child("foodmenu").child("food6").child("name").setValue("Tuna Pizza");
//        mDatabase.child("foodmenu").child("food6").child("price").setValue("20.00");
//
//        mDatabase.child("foodmenu").child("food7").child("name").setValue("Cheese Pizza");
//        mDatabase.child("foodmenu").child("food7").child("price").setValue("10.00");
//
//        mDatabase.child("foodmenu").child("food8").child("name").setValue("Pepperoni Pizza");
//        mDatabase.child("foodmenu").child("food8").child("price").setValue("25.00");


//        mActivityFoodMenuBinding.textView.setText(tablename);
    }

    public void confirmorder(View view) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY HH:mm");
        Calendar c = Calendar.getInstance();
        String date = sdf.format(c.getTime());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("ordertime").setValue(date);
    }

    public void addtoorder1(View view) {
        count1 = count1 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("0").setValue(mActivityFoodMenuBinding.buttonFood1.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("0").child(mActivityFoodMenuBinding.buttonFood1.getText().toString()).child("price").setValue(price1);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("0").child(mActivityFoodMenuBinding.buttonFood1.getText().toString()).child("quantity").setValue(count1);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder2(View view) {
        count2 = count2 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("1").setValue(mActivityFoodMenuBinding.buttonFood2.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("1").child(mActivityFoodMenuBinding.buttonFood2.getText().toString()).child("price").setValue(price2);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("1").child(mActivityFoodMenuBinding.buttonFood2.getText().toString()).child("quantity").setValue(count2);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);

    }

    public void addtoorder3(View view) {
        count3 = count3 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("3").setValue(mActivityFoodMenuBinding.buttonFood3.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("3").child(mActivityFoodMenuBinding.buttonFood3.getText().toString()).child("price").setValue(price3);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("3").child(mActivityFoodMenuBinding.buttonFood3.getText().toString()).child("quantity").setValue(count3);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder4(View view) {
        count4 = count4 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("4").setValue(mActivityFoodMenuBinding.buttonFood4.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("4").child(mActivityFoodMenuBinding.buttonFood4.getText().toString()).child("price").setValue(price4);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("4").child(mActivityFoodMenuBinding.buttonFood4.getText().toString()).child("quantity").setValue(count4);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder5(View view) {
        count5 = count5 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("5").setValue(mActivityFoodMenuBinding.buttonFood5.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("5").child(mActivityFoodMenuBinding.buttonFood5.getText().toString()).child("price").setValue(price5);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("5").child(mActivityFoodMenuBinding.buttonFood5.getText().toString()).child("quantity").setValue(count5);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder6(View view) {
        count6 = count6 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("6").setValue(mActivityFoodMenuBinding.buttonFood6.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("6").child(mActivityFoodMenuBinding.buttonFood6.getText().toString()).child("price").setValue(price6);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("6").child(mActivityFoodMenuBinding.buttonFood6.getText().toString()).child("quantity").setValue(count6);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder7(View view) {
        count7 = count7 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("7").setValue(mActivityFoodMenuBinding.buttonFood7.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("7").child(mActivityFoodMenuBinding.buttonFood7.getText().toString()).child("price").setValue(price7);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("7").child(mActivityFoodMenuBinding.buttonFood7.getText().toString()).child("quantity").setValue(count7);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder8(View view) {
        count8 = count8 + 1;
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("staff name").setValue("tyc");
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("8").setValue(mActivityFoodMenuBinding.buttonFood8.getText().toString());
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("8").child(mActivityFoodMenuBinding.buttonFood8.getText().toString()).child("price").setValue(price8);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("food").child("8").child(mActivityFoodMenuBinding.buttonFood8.getText().toString()).child("quantity").setValue(count8);
        mDatabase.child("orderlist").child("placed").child(ordernumber).child("tablenumber").setValue(tablename);
    }

    public void addtoorder9(View view) {
    }

    public void addtoorder10(View view) {
    }

}