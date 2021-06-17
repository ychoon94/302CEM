package com.example.smileyrestaurant.till;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityTillBinding;
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

public class TillActivity extends AppCompatActivity {

    private ActivityTillBinding mActivityTillBinding;

    private DatabaseReference mDatabase;

    private String table, food1, food2, food3, quantity1, quantity2, quantity3, price1, price2, price3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_till);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mActivityTillBinding = DataBindingUtil.setContentView(this, R.layout.activity_till);
    }

    public void paymentdone(View view) {
        String payment_string = mActivityTillBinding.editTextNumberDecimalPayment.getText().toString();
        double payment_double = Double.parseDouble(payment_string);
        String total_string = mActivityTillBinding.textViewTallytotal.getText().toString();
        double total_double = Double.parseDouble(total_string);
        double change_double = payment_double - total_double;
        String change_string = String.valueOf(change_double);
        mActivityTillBinding.textViewChange.setText(change_string);
        mDatabase.child("tableoccupied").child(table).setValue("0");
    }

    public void load_order1(View view) {
        table = mActivityTillBinding.button.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order2(View view) {
        table = mActivityTillBinding.button2.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order3(View view) {
        table = mActivityTillBinding.button3.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order4(View view) {
        table = mActivityTillBinding.button4.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");

    }

    public void load_order5(View view) {
        table = mActivityTillBinding.button5.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order6(View view) {
        table = mActivityTillBinding.button6.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order7(View view) {
        table = mActivityTillBinding.button7.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order8(View view) {
        table = mActivityTillBinding.button8.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order9(View view) {
        table = mActivityTillBinding.button9.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void load_order10(View view) {
        table = mActivityTillBinding.button10.getText().toString();
        mDatabase.child("bills").child(table).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("1")) {
                            Map<String, Object> td1 = (HashMap<String, Object>) data.getValue();
                            List<Object> values1 = new ArrayList<>(td1.values());

                            food1 = values1.get(2).toString();
                            quantity1 = values1.get(0).toString();
                            price1 = values1.get(1).toString();
                        }
                        if (data.getKey().equals("2")){
                            Map<String, Object> td2 = (HashMap<String, Object>) data.getValue();
                            List<Object> values2 = new ArrayList<>(td2.values());

                            food2 = values2.get(2).toString();
                            quantity2 = values2.get(0).toString();
                            price2 = values2.get(1).toString();
                        }
                        if (data.getKey().equals("3")){
                            Map<String, Object> td3 = (HashMap<String, Object>) data.getValue();
                            List<Object> values3 = new ArrayList<>(td3.values());

                            food3 = values3.get(2).toString();
                            quantity3 = values3.get(0).toString();
                            price3 = values3.get(1).toString();
                        }
                        if (data.getKey().equals("4")){

                            Map<String, Object> td4 = (HashMap<String, Object>) data.getValue();
                            List<Object> values4 = new ArrayList<>(td4.values());

                            food1 = values4.get(2).toString();
                            quantity1 = values4.get(0).toString();
                            price1 = values4.get(1).toString();

                        }
                        if (data.getKey().equals("5")){
                            Map<String, Object> td5 = (HashMap<String, Object>) data.getValue();
                            List<Object> values5 = new ArrayList<>(td5.values());

                            food2 = values5.get(2).toString();
                            quantity2 = values5.get(0).toString();
                            price2 = values5.get(1).toString();
                        }
                        if (data.getKey().equals("6")){
                            Map<String, Object> td6 = (HashMap<String, Object>) data.getValue();
                            List<Object> values6 = new ArrayList<>(td6.values());

                            food3 = values6.get(2).toString();
                            quantity3 = values6.get(0).toString();
                            price3 = values6.get(1).toString();
                        }
                        if (data.getKey().equals("7")){
                            Map<String, Object> td7 = (HashMap<String, Object>) data.getValue();
                            List<Object> values7 = new ArrayList<>(td7.values());

                            food1 = values7.get(2).toString();
                            quantity1 = values7.get(0).toString();
                            price1 = values7.get(1).toString();
                        }
                        if (data.getKey().equals("8")){
                            Map<String, Object> td8 = (HashMap<String, Object>) data.getValue();
                            List<Object> values8 = new ArrayList<>(td8.values());

                            food2 = values8.get(2).toString();
                            quantity2 = values8.get(0).toString();
                            price2 = values8.get(1).toString();
                        }
                    }
                }
            }
        });
        mActivityTillBinding.textViewTablenumber1.setText(table);
        Toast.makeText(this, table, Toast.LENGTH_SHORT).show();
        mActivityTillBinding.textviewFoodname1.setText(food1);
        mActivityTillBinding.textViewQuantity1.setText(quantity1);
        mActivityTillBinding.textViewFoodname2.setText(food2);
        mActivityTillBinding.textViewQuantity2.setText(quantity2);
        mActivityTillBinding.textViewFoodname3.setText(food3);
        mActivityTillBinding.textViewQuantity3.setText(quantity3);
        mActivityTillBinding.hiddenPrice1.setText(price1);
        mActivityTillBinding.hiddenPrice2.setText(price2);
        mActivityTillBinding.hiddenPrice3.setText(price3);

        mActivityTillBinding.textViewTallytotal.setText(" ");
        mActivityTillBinding.editTextNumberDecimalPayment.setText(" ");
        mActivityTillBinding.textViewChange.setText(" ");
    }

    public void calculate(View view) {
        double intquantity1 = Double.parseDouble(mActivityTillBinding.textViewQuantity1.getText().toString());
        double intprice1 = Double.parseDouble(mActivityTillBinding.hiddenPrice1.getText().toString());
        double intquantity2 = Double.parseDouble(mActivityTillBinding.textViewQuantity2.getText().toString());
        double intprice2 = Double.parseDouble(mActivityTillBinding.hiddenPrice2.getText().toString());
        double intquantity3 = Double.parseDouble(mActivityTillBinding.textViewQuantity3.getText().toString());
        double intprice3 = Double.parseDouble(mActivityTillBinding.hiddenPrice3.getText().toString());
        double total = (intquantity1*intprice1) + (intquantity2*intprice2) + (intquantity3*intprice3);
        String total_string = String.valueOf(total);
        mActivityTillBinding.textViewTallytotal.setText(total_string);
    }
}