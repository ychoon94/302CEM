package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;

import com.example.smileyrestaurant.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;

    private DatabaseReference mDatabase;

    public static final String TAG = "TAG";

    private String ordertime1, ordertime2, foodname1, foodname2, foodname3, foodname4, foodname5, foodname6, quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, status1, status2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //error here

        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("orderlist").child("1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    //merge from carmen
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("tablenumber")) {
                            String tablename = data.getValue().toString();
                            mActivityMainBinding.textViewTablenumber1.setText(tablename);
                        }
                        if (data.getKey().equals("ordertime")) {
                            String ordertime = data.getValue().toString();
                            mActivityMainBinding.textViewOrdertime1.setText(ordertime);
                        }
                        if (data.getKey().equals("status")) {
                            String status = data.getValue().toString();
                            mActivityMainBinding.textViewStatus1.setText(status);
                        }
                         if (data.getKey().equals("food")){
//                             Log.d("AAAAAAAAAAAAAAAAAAAAAAAAAA", String.valueOf(data.getChildrenCount()));
                             for (DataSnapshot data1 : data.getChildren()){
                                 if (data1.getKey().equals("1")) {
                                     Map<String, Object> td1 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values1 = new ArrayList<>(td1.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values1.get(2).toString());

                                     mActivityMainBinding.textviewFoodname1.setText(values1.get(2).toString());
                                     mActivityMainBinding.textViewQuantity1.setText(values1.get(0).toString());
                                 }
                                 if (data1.getKey().equals("2")) {
                                     Map<String, Object> td2 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values2 = new ArrayList<>(td2.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values2.get(2).toString());

                                     mActivityMainBinding.textViewFoodname2.setText(values2.get(2).toString());
                                     mActivityMainBinding.textViewQuantity2.setText(values2.get(0).toString());
                                 }
                                 if (data1.getKey().equals("3")) {
                                     Map<String, Object> td3 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values3 = new ArrayList<>(td3.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values3.get(2).toString());

                                     mActivityMainBinding.textViewFoodname3.setText(values3.get(2).toString());
                                     mActivityMainBinding.textViewQuantity3.setText(values3.get(0).toString());
                                 }
                                 if (data1.getKey().equals("4")) {
                                     Map<String, Object> td4 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values4 = new ArrayList<>(td4.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values4.get(2).toString());

                                     mActivityMainBinding.textviewFoodname1.setText(values4.get(2).toString());
                                     mActivityMainBinding.textViewQuantity1.setText(values4.get(0).toString());
                                 }
                                 if (data1.getKey().equals("5")) {
                                     Map<String, Object> td5 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values5 = new ArrayList<>(td5.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values5.get(2).toString());

                                     mActivityMainBinding.textViewFoodname2.setText(values5.get(2).toString());
                                     mActivityMainBinding.textViewQuantity2.setText(values5.get(0).toString());
                                 }
                                 if (data1.getKey().equals("6")) {
                                     Map<String, Object> td6 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values6 = new ArrayList<>(td6.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values6.get(2).toString());

                                     mActivityMainBinding.textViewFoodname3.setText(values6.get(2).toString());
                                     mActivityMainBinding.textViewQuantity3.setText(values6.get(0).toString());
                                 }
                                 if (data1.getKey().equals("7")) {
                                     Map<String, Object> td7 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values7 = new ArrayList<>(td7.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values7.get(2).toString());

                                     mActivityMainBinding.textviewFoodname1.setText(values7.get(2).toString());
                                     mActivityMainBinding.textViewQuantity1.setText(values7.get(0).toString());
                                 }
                                 if (data1.getKey().equals("8")) {
                                     Map<String, Object> td8 = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values8 = new ArrayList<>(td8.values());
//                                     Log.d("aaaaaaaaaaaaaaaa", values8.get(2).toString());

                                     mActivityMainBinding.textViewFoodname2.setText(values8.get(2).toString());
                                     mActivityMainBinding.textViewQuantity2.setText(values8.get(0).toString());
                                 }
                             }
                         }
                    }
                }
            }
        });

        mDatabase.child("orderlist").child("2").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("tablenumber")) {
                            String tablename = data.getValue().toString();
                            mActivityMainBinding.textViewTablenumber2.setText(tablename);
                        }
                        if (data.getKey().equals("ordertime")) {
                            String ordertime = data.getValue().toString();
                            mActivityMainBinding.textViewOrdertime2.setText(ordertime);
                        }
                        if (data.getKey().equals("status")) {
                            String status = data.getValue().toString();
                            mActivityMainBinding.textViewStatus2.setText(status);
                        }
                        if (data.getKey().equals("food")){
                            for (DataSnapshot data1 : data.getChildren()){
                                if (data1.getKey().equals("1")) {
                                    Map<String, Object> td1 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values1 = new ArrayList<>(td1.values());

                                    mActivityMainBinding.textViewFoodname4.setText(values1.get(2).toString());
                                    mActivityMainBinding.textViewQuantity4.setText(values1.get(0).toString());
                                }
                                if (data1.getKey().equals("2")) {
                                    Map<String, Object> td2 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values2 = new ArrayList<>(td2.values());

                                    mActivityMainBinding.textViewFoodname5.setText(values2.get(2).toString());
                                    mActivityMainBinding.textViewQuantity5.setText(values2.get(0).toString());
                                }
                                if (data1.getKey().equals("3")) {
                                    Map<String, Object> td3 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values3 = new ArrayList<>(td3.values());

                                    mActivityMainBinding.textViewFoodname6.setText(values3.get(2).toString());
                                    mActivityMainBinding.textViewQuantity6.setText(values3.get(0).toString());
                                }
                                if (data1.getKey().equals("4")) {
                                    Map<String, Object> td4 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values4 = new ArrayList<>(td4.values());

                                    mActivityMainBinding.textViewFoodname4.setText(values4.get(2).toString());
                                    mActivityMainBinding.textViewQuantity4.setText(values4.get(0).toString());
                                }
                                if (data1.getKey().equals("5")) {
                                    Map<String, Object> td5 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values5 = new ArrayList<>(td5.values());

                                    mActivityMainBinding.textViewFoodname5.setText(values5.get(2).toString());
                                    mActivityMainBinding.textViewQuantity5.setText(values5.get(0).toString());
                                }
                                if (data1.getKey().equals("6")) {
                                    Map<String, Object> td6 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values6 = new ArrayList<>(td6.values());

                                    mActivityMainBinding.textViewFoodname6.setText(values6.get(2).toString());
                                    mActivityMainBinding.textViewQuantity6.setText(values6.get(0).toString());
                                }
                                if (data1.getKey().equals("7")) {
                                    Map<String, Object> td7 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values7 = new ArrayList<>(td7.values());

                                    mActivityMainBinding.textViewFoodname4.setText(values7.get(2).toString());
                                    mActivityMainBinding.textViewQuantity4.setText(values7.get(0).toString());
                                }
                                if (data1.getKey().equals("8")) {
                                    Map<String, Object> td8 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values8 = new ArrayList<>(td8.values());

                                    mActivityMainBinding.textViewFoodname5.setText(values8.get(2).toString());
                                    mActivityMainBinding.textViewQuantity5.setText(values8.get(0).toString());
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public void addOrder(View view) {
        Intent intent = new Intent(this, ChooseTableActivity.class);
        startActivity(intent);
        finish();
    }

    public void kitchen(View view) {
        ordertime1 = mActivityMainBinding.textViewOrdertime1.getText().toString();
        foodname1 = mActivityMainBinding.textviewFoodname1.getText().toString();
        foodname2 = mActivityMainBinding.textViewFoodname2.getText().toString();
        foodname3 = mActivityMainBinding.textViewFoodname3.getText().toString();
        quantity1 = mActivityMainBinding.textViewQuantity1.getText().toString();
        quantity2 = mActivityMainBinding.textViewQuantity2.getText().toString();
        quantity3 = mActivityMainBinding.textViewQuantity3.getText().toString();
        status1 = mActivityMainBinding.textViewStatus1.getText().toString();

        ordertime2 = mActivityMainBinding.textViewOrdertime2.getText().toString();
        foodname4 = mActivityMainBinding.textViewFoodname4.getText().toString();
        foodname5 = mActivityMainBinding.textViewFoodname5.getText().toString();
        foodname6 = mActivityMainBinding.textViewFoodname6.getText().toString();
        quantity4 = mActivityMainBinding.textViewQuantity4.getText().toString();
        quantity5 = mActivityMainBinding.textViewQuantity5.getText().toString();
        quantity6 = mActivityMainBinding.textViewQuantity6.getText().toString();
        status2 = mActivityMainBinding.textViewStatus2.getText().toString();


        Intent intent1 = new Intent(this, KitchenActivity.class);
        intent1.putExtra("ordertime1", ordertime1);
        intent1.putExtra("foodname1", foodname1);
        intent1.putExtra("foodname2", foodname2);
        intent1.putExtra("foodname3", foodname3);
        intent1.putExtra("quantity1", quantity1);
        intent1.putExtra("quantity2", quantity2);
        intent1.putExtra("quantity3", quantity3);
        intent1.putExtra("status1",status1);

        intent1.putExtra("ordertime2", ordertime2);
        intent1.putExtra("foodname4", foodname4);
        intent1.putExtra("foodname5", foodname5);
        intent1.putExtra("foodname6", foodname6);
        intent1.putExtra("quantity4", quantity4);
        intent1.putExtra("quantity5", quantity5);
        intent1.putExtra("quantity6", quantity6);
        intent1.putExtra("status2", status2);
        startActivity(intent1);
        finish();
    }
}