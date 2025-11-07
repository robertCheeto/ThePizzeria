package com.pluralsight.models;

import java.util.List;

public class Pizza extends MenuItem {
    private String crustType;
    private String size;
    private List<Toppings> toppings;

    public Pizza(String name, double price, String crustType, String size, List<Toppings> toppings) {
        super(name, price);
        this.crustType = crustType;
        this.size = size;
        this.toppings = toppings;
    }

    public String getCrustType() {
        return crustType;
    }

    public String getSize() {
        return size;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    @Override
    public void getTotalPrice() {

    }
}
