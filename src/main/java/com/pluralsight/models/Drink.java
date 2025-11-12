package com.pluralsight.models;

public class Drink extends MenuItem {
    private String flavor;
    private String size;

    public Drink(String name, double price, String flavor, String size) {
        super(name, price);
        this.flavor = flavor;
        this.size = size;
    }

    public Drink(String name, double price) {
        super(name, price);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getTotalPrice() {
        if (this.size.equals("Small")) {
            return this.price = 2.00;
        }
        else if (this.size.equals("Medium")) {
            return this.price = 2.50;
        }
        else {
            return this.price = 3.00;
        }
    }
}
