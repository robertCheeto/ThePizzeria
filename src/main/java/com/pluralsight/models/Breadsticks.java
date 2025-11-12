package com.pluralsight.models;

public class Breadsticks extends MenuItem {
    private String type;

    public Breadsticks(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public Breadsticks(String name, double price) {
        super(name, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public double getTotalPrice() {
        return 1.50;
    }
}
