package com.example.smileyrestaurant.till;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class TillActivityTest {
    Double change;

    @Mock
    Double total = 190.00;
    Double payment = 200.00;

    @Before
    public void init(){
        change = payment - total;
    }

    @Test
    public void calculate() {
        assertEquals(String.valueOf(change), "7.0");
    }
}