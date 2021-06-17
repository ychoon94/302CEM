package com.example.smileyrestaurant.welcome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.smileyrestaurant.R;
import com.example.smileyrestaurant.databinding.ActivityAssignTableBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class AssignTableActivity extends AppCompatActivity {

    private ActivityAssignTableBinding mActivityAssignTableBinding;

    private DatabaseReference mDatabase;

    private String tablename;
    private String ordernumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_table);

        mActivityAssignTableBinding = DataBindingUtil.setContentView(this, R.layout.activity_assign_table);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("tableoccupied").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                } else {
                    for (DataSnapshot data : task.getResult().getChildren()){
                        if (data.getKey().equals("Table 1")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable1.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 2")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable2.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 3")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable3.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 4")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable4.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 5")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable5.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 6")){
                            if (data.getValue().equals("1")){
                                mActivityAssignTableBinding.buttonTable6.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 7")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable7.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 8")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable8.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 9")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable9.setVisibility(View.INVISIBLE);
                            }
                        }
                        if (data.getKey().equals("Table 10")){
                            if (data.getValue().equals("1")){
                                overridePendingTransition(0,0);
                                mActivityAssignTableBinding.buttonTable10.setVisibility(View.INVISIBLE);
                            }
                        }
                    }
                }
            }
        });
    }


    public void menu1(View view) {
        mDatabase.child("tableoccupied").child("Table 1").setValue("1");
        mActivityAssignTableBinding.buttonTable1.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu2(View view) {
        mDatabase.child("tableoccupied").child("Table 2").setValue("1");
        mActivityAssignTableBinding.buttonTable2.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu3(View view) {
        mDatabase.child("tableoccupied").child("Table 3").setValue("1");
        mActivityAssignTableBinding.buttonTable3.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu4(View view) {
        mDatabase.child("tableoccupied").child("Table 4").setValue("1");
        mActivityAssignTableBinding.buttonTable4.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu5(View view) {
        mDatabase.child("tableoccupied").child("Table 5").setValue("1");
        mActivityAssignTableBinding.buttonTable5.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu6(View view) {
        mDatabase.child("tableoccupied").child("Table 6").setValue("1");
        mActivityAssignTableBinding.buttonTable6.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu7(View view) {
        mDatabase.child("tableoccupied").child("Table 7").setValue("1");
        mActivityAssignTableBinding.buttonTable7.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu8(View view) {
        mDatabase.child("tableoccupied").child("Table 8").setValue("1");
        mActivityAssignTableBinding.buttonTable8.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu9(View view) {
        mDatabase.child("tableoccupied").child("Table 9").setValue("1");
        mActivityAssignTableBinding.buttonTable9.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void menu10(View view) {
        mDatabase.child("tableoccupied").child("Table 10").setValue("1");
        mActivityAssignTableBinding.buttonTable10.setVisibility(View.INVISIBLE);
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }

    public void refresh(View view) {
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        finish();
        startActivity(intent);
        overridePendingTransition(0,0);
    }
}