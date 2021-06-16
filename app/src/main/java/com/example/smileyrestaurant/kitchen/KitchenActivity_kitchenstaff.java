package com.example.smileyrestaurant.kitchen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityKitchen2Binding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.view.View.GONE;

public class KitchenActivity_kitchenstaff extends AppCompatActivity {

    private ActivityKitchen2Binding mActivityKitchen2Binding;

    private DatabaseReference mDatabase;

    private String status1, status2, status3, status4, status5, status6;
    private String foodid1, foodid2, foodid3, foodid4, foodid5, foodid6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen2);

        mActivityKitchen2Binding = DataBindingUtil.setContentView(this, R.layout.activity_kitchen2);

        mActivityKitchen2Binding.linearlayout1.setVisibility(GONE);
        mActivityKitchen2Binding.linearlayout2.setVisibility(GONE);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("kitchen").child("1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()){
                        if (data.getKey().equals("ordertime")){
                            String ordertime = data.getValue().toString();
                            mActivityKitchen2Binding.linearlayout1.setVisibility(View.VISIBLE);
                            mActivityKitchen2Binding.textViewOrdertime1.setText(ordertime);
                            mActivityKitchen2Binding.textViewOrdertime2.setText(ordertime);
                            mActivityKitchen2Binding.textViewOrdertime3.setText(ordertime);

                        }
                        if (data.getKey().equals("food")){
                            for (DataSnapshot data1 : data.getChildren()){
                                if (data1.getKey().equals("1")){
                                    Map<String, Object> td1 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values1 = new ArrayList<>(td1.values());

                                    mActivityKitchen2Binding.textviewFoodname1.setText(values1.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity1.setText(values1.get(0).toString());
                                    status1 = values1.get(3).toString();
                                    foodid1 = values1.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid1);
                                }
                                if (data1.getKey().equals("2")){
                                    Map<String, Object> td2 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values2 = new ArrayList<>(td2.values());

                                    mActivityKitchen2Binding.textViewFoodname2.setText(values2.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity2.setText(values2.get(0).toString());
                                    status2 = values2.get(3).toString();
                                    foodid2 = values2.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid2);
                                }
                                if (data1.getKey().equals("3")){
                                    Map<String, Object> td3 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values3 = new ArrayList<>(td3.values());

                                    mActivityKitchen2Binding.textViewFoodname3.setText(values3.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity3.setText(values3.get(0).toString());
                                    status3 = values3.get(3).toString();
                                    foodid3 = values3.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid3);
                                }
                                if (data1.getKey().equals("4")){
                                    Map<String, Object> td4 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values4 = new ArrayList<>(td4.values());

                                    mActivityKitchen2Binding.textviewFoodname1.setText(values4.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity1.setText(values4.get(0).toString());
                                    status1 = values4.get(3).toString();
                                    foodid1 = values4.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid1);
                                }
                                if (data1.getKey().equals("5")){
                                    Map<String, Object> td5 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values5 = new ArrayList<>(td5.values());

                                    mActivityKitchen2Binding.textViewFoodname2.setText(values5.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity2.setText(values5.get(0).toString());
                                    status2 = values5.get(3).toString();
                                    foodid2 = values5.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid2);
                                }
                                if (data1.getKey().equals("6")){
                                    Map<String, Object> td6 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values6 = new ArrayList<>(td6.values());

                                    mActivityKitchen2Binding.textViewFoodname3.setText(values6.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity3.setText(values6.get(0).toString());
                                    status3 = values6.get(3).toString();
                                    foodid3 = values6.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid3);
                                }
                                if (data1.getKey().equals("7")){
                                    Map<String, Object> td7 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values7 = new ArrayList<>(td7.values());

                                    mActivityKitchen2Binding.textviewFoodname1.setText(values7.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity1.setText(values7.get(0).toString());
                                    status1 = values7.get(3).toString();
                                    foodid1 = values7.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid1);
                                }
                                if (data1.getKey().equals("8")){
                                    Map<String, Object> td8 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values8 = new ArrayList<>(td8.values());

                                    mActivityKitchen2Binding.textViewFoodname2.setText(values8.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity2.setText(values8.get(0).toString());
                                    status2 = values8.get(3).toString();
                                    foodid2 = values8.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA", foodid2);
                                }
                            }
                            if (status1.equals("ready")){
                                mActivityKitchen2Binding.textviewFoodname1.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewQuantity1.setVisibility(GONE);
                                mActivityKitchen2Binding.buttonReady1.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewOrdertime1.setVisibility(GONE);
                            }
                            if (status2.equals("ready")){
                                mActivityKitchen2Binding.textViewFoodname2.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewQuantity2.setVisibility(GONE);
                                mActivityKitchen2Binding.buttonReady2.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewOrdertime2.setVisibility(GONE);
                            }
                            if (status3.equals("ready")){
                                mActivityKitchen2Binding.textViewFoodname3.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewQuantity3.setVisibility(GONE);
                                mActivityKitchen2Binding.buttonReady3.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewOrdertime3.setVisibility(GONE);
                            }
                        }
                    }
                }
            }
        });

        mDatabase.child("kitchen").child("2").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()){
                        if (data.getKey().equals("ordertime")){
                            String ordertime = data.getValue().toString();
                            mActivityKitchen2Binding.linearlayout2.setVisibility(View.VISIBLE);
                            mActivityKitchen2Binding.textViewOrdertime4.setText(ordertime);
                            mActivityKitchen2Binding.textViewOrdertime5.setText(ordertime);
                            mActivityKitchen2Binding.textViewOrdertime6.setText(ordertime);

                        }
                        if (data.getKey().equals("food")){
                            for (DataSnapshot data1 : data.getChildren()){
                                if (data1.getKey().equals("1")){
                                    Map<String, Object> td1 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values1 = new ArrayList<>(td1.values());

                                    mActivityKitchen2Binding.textViewFoodname4.setText(values1.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity4.setText(values1.get(0).toString());
                                    status4 = values1.get(3).toString();
                                    foodid4 = values1.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid4);
                                }
                                if (data1.getKey().equals("2")){
                                    Map<String, Object> td2 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values2 = new ArrayList<>(td2.values());

                                    mActivityKitchen2Binding.textViewFoodname5.setText(values2.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity5.setText(values2.get(0).toString());
                                    status5 = values2.get(3).toString();
                                    foodid5 = values2.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid5);
                                }
                                if (data1.getKey().equals("3")){
                                    Map<String, Object> td3 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values3 = new ArrayList<>(td3.values());

                                    mActivityKitchen2Binding.textViewFoodname6.setText(values3.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity6.setText(values3.get(0).toString());
                                    status6 = values3.get(3).toString();
                                    foodid6 = values3.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid6);
                                }
                                if (data1.getKey().equals("4")){
                                    Map<String, Object> td4 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values4 = new ArrayList<>(td4.values());

                                    mActivityKitchen2Binding.textViewFoodname4.setText(values4.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity4.setText(values4.get(0).toString());
                                    status4 = values4.get(3).toString();
                                    foodid4 = values4.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid4);
                                }
                                if (data1.getKey().equals("5")){
                                    Map<String, Object> td5 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values5 = new ArrayList<>(td5.values());

                                    mActivityKitchen2Binding.textViewFoodname5.setText(values5.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity5.setText(values5.get(0).toString());
                                    status5 = values5.get(3).toString();
                                    foodid5 = values5.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid5);
                                }
                                if (data1.getKey().equals("6")){
                                    Map<String, Object> td6 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values6 = new ArrayList<>(td6.values());

                                    mActivityKitchen2Binding.textViewFoodname6.setText(values6.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity3.setText(values6.get(0).toString());
                                    status6 = values6.get(3).toString();
                                    foodid6 = values6.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid6);
                                }
                                if (data1.getKey().equals("7")){
                                    Map<String, Object> td7 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values7 = new ArrayList<>(td7.values());

                                    mActivityKitchen2Binding.textViewFoodname4.setText(values7.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity4.setText(values7.get(0).toString());
                                    status4 = values7.get(3).toString();
                                    foodid4 = values7.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid4);
                                }
                                if (data1.getKey().equals("8")){
                                    Map<String, Object> td8 = (HashMap<String, Object>) data1.getValue();
                                    List<Object> values8 = new ArrayList<>(td8.values());

                                    mActivityKitchen2Binding.textViewFoodname5.setText(values8.get(2).toString());
                                    mActivityKitchen2Binding.textViewQuantity5.setText(values8.get(0).toString());
                                    status5 = values8.get(3).toString();
                                    foodid5 = values8.get(1).toString();
                                    Log.d("AAAAAAAAAAAAAAAAAAAAAAA2", foodid5);
                                }
                            }
                            if (status4.equals("ready")){
                                mActivityKitchen2Binding.textViewFoodname4.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewQuantity4.setVisibility(GONE);
                                mActivityKitchen2Binding.buttonReady4.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewOrdertime4.setVisibility(GONE);
                            }
                            if (status5.equals("ready")){
                                mActivityKitchen2Binding.textViewFoodname5.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewQuantity5.setVisibility(GONE);
                                mActivityKitchen2Binding.buttonReady5.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewOrdertime5.setVisibility(GONE);
                            }
                            if (status6.equals("ready")){
                                mActivityKitchen2Binding.textViewFoodname6.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewQuantity6.setVisibility(GONE);
                                mActivityKitchen2Binding.buttonReady6.setVisibility(GONE);
                                mActivityKitchen2Binding.textViewOrdertime6.setVisibility(GONE);
                            }
                        }
                    }
                }
            }
        });

    }

    public void readyfood1(View view) {
        status1 = "ready";
        if ( status1.equals("ready")){
            if (status2.equals("ready")){
                if (status3.equals("ready")){
                    mDatabase.child("orderlist").child("1").child("status").setValue("ready");
                }
            }
        }
        mDatabase.child("kitchen").child("1").child("food").child(foodid1).child("status").setValue("ready");
        mActivityKitchen2Binding.textviewFoodname1.setVisibility(GONE);
        mActivityKitchen2Binding.textViewQuantity1.setVisibility(GONE);
        mActivityKitchen2Binding.buttonReady1.setVisibility(GONE);
        mActivityKitchen2Binding.textViewOrdertime1.setVisibility(GONE);

    }

    public void readyfood2(View view) {
        status2 = "ready";
        if ( status1.equals("ready")){
            if (status2.equals("ready")){
                if (status3.equals("ready")){
                    mDatabase.child("orderlist").child("1").child("status").setValue("ready");
                }
            }
        }
        mDatabase.child("kitchen").child("1").child("food").child(foodid2).child("status").setValue("ready");
        mActivityKitchen2Binding.textViewFoodname2.setVisibility(GONE);
        mActivityKitchen2Binding.textViewQuantity2.setVisibility(GONE);
        mActivityKitchen2Binding.buttonReady2.setVisibility(GONE);
        mActivityKitchen2Binding.textViewOrdertime2.setVisibility(GONE);

    }

    public void readyfood3(View view) {
        status3 = "ready";
        if ( status1.equals("ready")){
            if (status2.equals("ready")){
                if (status3.equals("ready")){
                    mDatabase.child("orderlist").child("1").child("status").setValue("ready");
                }
            }
        }
        mDatabase.child("kitchen").child("1").child("food").child(foodid3).child("status").setValue("ready");
        mActivityKitchen2Binding.textViewFoodname3.setVisibility(GONE);
        mActivityKitchen2Binding.textViewQuantity3.setVisibility(GONE);
        mActivityKitchen2Binding.buttonReady3.setVisibility(GONE);
        mActivityKitchen2Binding.textViewOrdertime3.setVisibility(GONE);
    }

    public void readyfood4(View view) {
        status4 = "ready";
        if ( status4.equals("ready")){
            if (status5.equals("ready")){
                if (status6.equals("ready")){
                    mDatabase.child("orderlist").child("2").child("status").setValue("ready");
                }
            }
        }
        mDatabase.child("kitchen").child("2").child("food").child(foodid4).child("status").setValue("ready");
        mActivityKitchen2Binding.textViewFoodname4.setVisibility(GONE);
        mActivityKitchen2Binding.textViewQuantity4.setVisibility(GONE);
        mActivityKitchen2Binding.buttonReady4.setVisibility(GONE);
        mActivityKitchen2Binding.textViewOrdertime4.setVisibility(GONE);
    }

    public void readyfood5(View view) {
        status5 = "ready";
        if ( status4.equals("ready")){
            if (status5.equals("ready")){
                if (status6.equals("ready")){
                    mDatabase.child("orderlist").child("2").child("status").setValue("ready");
                }
            }
        }
        mDatabase.child("kitchen").child("2").child("food").child(foodid5).child("status").setValue("ready");
        mActivityKitchen2Binding.textViewFoodname5.setVisibility(GONE);
        mActivityKitchen2Binding.textViewQuantity5.setVisibility(GONE);
        mActivityKitchen2Binding.buttonReady5.setVisibility(GONE);
        mActivityKitchen2Binding.textViewOrdertime5.setVisibility(GONE);
    }

    public void readyfood6(View view) {
        status6 = "ready";
        if ( status4.equals("ready")){
            if (status5.equals("ready")){
                if (status6.equals("ready")){
                    mDatabase.child("orderlist").child("2").child("status").setValue("ready");
                }
            }
        }
        mDatabase.child("kitchen").child("2").child("food").child(foodid6).child("status").setValue("ready");
        mActivityKitchen2Binding.textViewFoodname6.setVisibility(GONE);
        mActivityKitchen2Binding.textViewQuantity6.setVisibility(GONE);
        mActivityKitchen2Binding.buttonReady6.setVisibility(GONE);
        mActivityKitchen2Binding.textViewOrdertime6.setVisibility(GONE);
    }
}