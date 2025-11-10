package com.pluralsight.models;

import java.util.List;

public class Pizza extends MenuItem {
    private String crustType;
    private String size;
    private List<Toppings> toppings;

    public Pizza(String name, String size, double price, String crustType, List<Toppings> toppings) {
        super(name, price);
        this.crustType = crustType;
        this.size = size;
        this.toppings = toppings;
    }

    public Pizza(String name, double price) {
        super(name, price);
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
    public String toString() {
        return "Pizza{" +
                "crustType='" + crustType + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void getTotalPrice() {

    }
}
