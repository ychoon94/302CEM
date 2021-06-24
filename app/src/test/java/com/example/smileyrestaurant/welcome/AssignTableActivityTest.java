package com.example.smileyrestaurant.welcome;

import com.example.smileyrestaurant.databinding.ActivityChooseTableBinding;
import com.example.smileyrestaurant.model.Staff;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AssignTableActivityTest {

    @Mock
    Map<String, String> map = new HashMap<String, String>();

    @Before
    public void init(){

        map.put("Table 1","0");
        map.put("Table 2","0");
        map.put("Table 3","0");
        map.put("Table 4","0");
        map.put("Table 5","0");
        map.put("Table 6","0");
        map.put("Table 7","0");
        map.put("Table 8","0");
        map.put("Table 9","0");
        map.put("Table 10","0");
    }

    @Test
    public void menu1() {
        map.replace("Table 1", "0", "1");
        assertEquals(map.get("Table 1"), "1");
        assertEquals(map.get("Table 1"), "0");
    }

    @Test
    public void menu2() {
        map.replace("Table 2", "0", "1");
        assertEquals(map.get("Table 2"), "1");
        //assertEquals(map.get("Table 2"), "0");
    }

    @Test
    public void menu3() {
        map.replace("Table 3", "0", "1");
        assertEquals(map.get("Table 3"), "1");
        //assertEquals(map.get("Table 3"), "0");
    }

    @Test
    public void menu4() {
        map.replace("Table 4", "0", "1");
        assertEquals(map.get("Table 4"), "1");
        //assertEquals(map.get("Table 4"), "0");
    }

    @Test
    public void menu5() {
        map.replace("Table 5", "0", "1");
        assertEquals(map.get("Table 5"), "1");
        //assertEquals(map.get("Table 5"), "0");
    }

    @Test
    public void menu6() {
        map.replace("Table 6", "0", "1");
        assertEquals(map.get("Table 6"), "1");
        //assertEquals(map.get("Table 6"), "0");
    }

    @Test
    public void menu7() {
        map.replace("Table 7", "0", "1");
        assertEquals(map.get("Table 7"), "1");
        //assertEquals(map.get("Table 7"), "0");
    }

    @Test
    public void menu8() {
        map.replace("Table 8", "0", "1");
        assertEquals(map.get("Table 8"), "1");
        //assertEquals(map.get("Table 8"), "0");
    }

    @Test
    public void menu9() {
        map.replace("Table 9", "0", "1");
        assertEquals(map.get("Table 9"), "1");
        //assertEquals(map.get("Table 9"), "0");
    }

    @Test
    public void menu10() {
        map.replace("Table 10", "0", "1");
        assertEquals(map.get("Table 10"), "1");
        //assertEquals(map.get("Table 10"), "0");
    }
}