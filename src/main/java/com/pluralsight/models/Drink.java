package com.pluralsight.models;

public class Drink extends MenuItem {
    private String flavor;
    private String size;

    public Drink(String name, double price, String flavor, String size) {
        super(name, price);
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void getTotalPrice() {

    }
}
