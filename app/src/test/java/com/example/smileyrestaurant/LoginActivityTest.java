package com.example.smileyrestaurant;

import com.example.smileyrestaurant.model.Staff;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginActivityTest {

    List<Staff> staffList = new ArrayList<Staff>();

    @Mock
    Staff mike = new Staff("chef","p455w0rd", "kitchen");
    Staff adam = new Staff("waiter","p455w0rd", "welcome");

    @Before
    public void init(){
        staffList.add(mike);
        staffList.add(adam);
    }

    @Test
    public void loginAccount() {
        assertEquals(mike.getRole(), "kitchen");
        assertEquals(adam.getPassword(), "p455w0rd");
        //assertEquals(mike.getPassword(),"123456");
    }
}