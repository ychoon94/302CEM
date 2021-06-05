package com.example.smileyrestaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderPlaced {
    private int id;
    private String timeOrdered;
    private int tableNo;
    private int totalNoPlaced;
    private int totalPlacedQuantity;
    private String foodItem;

    public OrderPlaced(int id, String timeOrdered, int tableNo, int totalNoPlaced, int totalPlacedQuantity, String foodItem) {
        this.id = id;
        this.timeOrdered = timeOrdered;
        this.tableNo = tableNo;
        this.totalNoPlaced = totalNoPlaced;
        this.totalPlacedQuantity = totalPlacedQuantity;
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "OrderPlaced{" +
                "id=" + id +
                ", timeOrdered=" + timeOrdered +
                ", tableNo=" + tableNo +
                ", totalNoPlaced=" + totalNoPlaced +
                ", totalPlacedQuantity=" + totalPlacedQuantity +
                ", foodItem=" + foodItem +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeOrdered() {
        return timeOrdered;
    }


    public void setTimeOrdered(String timeOrdered) {
        this.timeOrdered = timeOrdered;
        Date orderTime = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");
        timeFormat.format(orderTime);
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getTotalNoPlaced() {
        return totalNoPlaced;
    }

    public void setTotalNoPlaced(int totalNoPlaced) {
        this.totalNoPlaced = totalNoPlaced;
    }

    public int getTotalPlacedQuantity() {
        return totalPlacedQuantity;
    }

    public void setTotalPlacedQuantity(int totalPlacedQuantity) {
        this.totalPlacedQuantity = totalPlacedQuantity;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }
}
