package com.pluralsight.models;

public class Breadsticks extends MenuItem {
    private String size;

    public Breadsticks(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void getTotalPrice() {

    }
}
