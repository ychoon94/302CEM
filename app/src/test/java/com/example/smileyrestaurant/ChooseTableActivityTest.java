package com.example.smileyrestaurant;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ChooseTableActivityTest {

    @Mock
    Map<String, String> map = new HashMap<String, String>();

    @Before
    public void setUp() throws Exception {
        map.put("Table 1","0");
        map.put("Table 2","0");
        map.put("Table 3","0");
        map.put("Table 4","1");
        map.put("Table 5","0");
        map.put("Table 6","0");
        map.put("Table 7","0");
        map.put("Table 8","0");
        map.put("Table 9","0");
        map.put("Table 10","0");
    }

    @Test
    public void menu1() {
        assertEquals(map.get("Table 1"), "0");
    }

    @Test
    public void menu2() {
        assertEquals(map.get("Table 2"), "0");
    }

    @Test
    public void menu3() {
        assertEquals(map.get("Table 3"), "0");
    }

    @Test
    public void menu4() {
        assertEquals(map.get("Table 4"), "1");
    }

    @Test
    public void menu5() {
        assertEquals(map.get("Table 5"), "0");
    }

    @Test
    public void menu6() {
        assertEquals(map.get("Table 6"), "0");
    }

    @Test
    public void menu7() {
        assertEquals(map.get("Table 7"), "0");
    }

    @Test
    public void menu8() {
        assertEquals(map.get("Table 8"), "0");
    }

    @Test
    public void menu9() {
        assertEquals(map.get("Table 9"), "0");
    }

    @Test
    public void menu10() {
        assertEquals(map.get("Table 10"), "0");
    }
}