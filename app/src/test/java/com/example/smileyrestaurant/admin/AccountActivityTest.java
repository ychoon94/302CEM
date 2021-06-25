package com.example.smileyrestaurant.admin;

import android.widget.Spinner;

import com.example.smileyrestaurant.model.Staff;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AccountActivityTest {

    List<Staff> staffList = new ArrayList<>();
    List<String> userrole = new ArrayList<String>();

    @Mock
    //test change role to chef
    Staff staff = new Staff("staff1", "p455w0rd", "kitchen");

    @Before
    public void init(){
        staffList.add(staff);
        userrole.add("welcome");
        userrole.add("servers");
        userrole.add("kitchen");
        userrole.add("till");
        staff.setRole("welcome");
    }

    @Test
    public void savechange1() {
        assertEquals(staff.getRole(), userrole.get(0));
    }

    @Test
    public void savechange2() {
        assertEquals(staff.getRole(), userrole.get(1));
    }

    @Test
    public void savechange3() {
        assertEquals(staff.getRole(), userrole.get(2));
    }

    @Test
    public void savechange4() {
        assertEquals(staff.getRole(), userrole.get(3));
    }
}