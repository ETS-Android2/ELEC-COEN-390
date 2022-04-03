package com.example.drinkingbuddy.Models;

public class Drink {

    protected String drinkName;
    protected Integer quantity;
    protected String timestamp;
    protected String dayOfWeek;

    public Drink(String drinkName, Integer quantity, String timestamp, String dayOfWeek) {
        this.drinkName = drinkName;
        this.quantity = quantity;
        this.timestamp = timestamp;
        this.dayOfWeek = dayOfWeek;

    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
