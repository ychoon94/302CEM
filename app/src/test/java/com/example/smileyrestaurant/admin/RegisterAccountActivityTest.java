package com.example.smileyrestaurant.admin;

import com.example.smileyrestaurant.model.Staff;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RegisterAccountActivityTest {

    List<Staff> staffList = new ArrayList<>();

    @Mock
    //test input for new account
    Staff newaccount = new Staff("staff1", "p455w0rd", "kitchen");

    @Before
    public void init(){
        staffList.add(newaccount);
    }

    @Test
    public void registeraccount() {
        for (Staff data : staffList){
            assertEquals(data.getUsername(), "staff1");
            assertEquals(data.getPassword(), "p455w0rd");
            assertEquals(data.getRole(), "kitchen");
        }
    }
}