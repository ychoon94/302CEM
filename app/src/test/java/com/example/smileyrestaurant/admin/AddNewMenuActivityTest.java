package com.example.smileyrestaurant.admin;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddNewMenuActivityTest {

    List<food> foodList = new ArrayList<>();

    public class food {
        private String name;
        private String status;
        private String price;

        public food(String name, String status, String price){
            this.name = name;
            this.status = status;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    @Mock
    food newfood = new food("Mushroom Pizza", "visible", "20.00");

    @Before
    public void init(){
        foodList.add(newfood);
    }

    @Test
    public void savenewmenuitem() {
        for (food data : foodList){
            assertEquals(data.getName(), "Mushroom Pizza");
            assertEquals(data.getPrice(), "20.00");
            assertEquals(data.getStatus(), "visible");
        }
    }
}