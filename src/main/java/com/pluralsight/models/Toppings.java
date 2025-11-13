package com.pluralsight.models;

public class Toppings {
    private String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        if (name.contains("No")) {
            return null;
        }
        else {
            return String.format("%s | $%.2f", name, price);
        }
    }
}
