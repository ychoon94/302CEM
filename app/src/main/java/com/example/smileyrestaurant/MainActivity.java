package com.example.smileyrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.smileyrestaurant.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
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

    private Integer ordernumber;

    private DatabaseReference mDatabase;

    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ordernumber = 0;

        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("orderlist").child("placed").child("1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    for (DataSnapshot data : task.getResult().getChildren()) {
                        if (data.getKey().equals("tablenumber")) {
                            String tablename = data.getValue().toString();
                            mActivityMainBinding.textViewTablenumber1.setText(tablename);
                            mActivityMainBinding.textViewStatus1.setText("Placed");
                        }
                        if (data.getKey().equals("ordertime")) {
                            String ordertime = data.getValue().toString();
                            mActivityMainBinding.textViewOrdertime1.setText(ordertime);
                        }
                         if (data.getKey().equals("food")){
//                             Log.d("AAAAAAAAAAAAAAAAAAAAAAAAAA", String.valueOf(data.getChildrenCount()));
                             for (DataSnapshot data1 : data.getChildren()){
                                 if (data1.getKey().equals("1")) {
                                     Map<String, Object> td = (HashMap<String, Object>) data1.getValue();
                                     List<Object> values = new ArrayList<>(td.values());
//                                     Object orderedfood = data1.getValue();
                                     Log.d("aaaaaaaaaaaaaaaa", values.get(2).toString());

                                     mActivityMainBinding.textviewFoodname1.setText(values.get(2).toString());
                                     mActivityMainBinding.textViewQuantity1.setText(values.get(0).toString());
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
        ordernumber = ordernumber + 1;
        intent.putExtra("ordernumber", ordernumber.toString());
        startActivity(intent);
    }

    public void kitchen(View view) {
    }
}