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

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public double getPrice() {
        if (this.size.equals("Personal Sized")) {
            return this.price = 8.50;
        }
        else if (this.size.equals("Regular Sized")) {
            return this.price = 12.00;
        }
        else {
            return this.price = 16.50;
        }
    }

    @Override
    public String toString() {
        if (this.toppings.contains(null)) {
            return name + "'s Pizza:\n" + size + " | " + crustType;
        }
        else {
            return name + "'s Pizza:\n" + size + " | " + crustType + "\nToppings: " + toppings;
        }
    }

    @Override
    public double getTotalPrice() {
        double price;
        double regularMultiplier = 2;
        double largeMultiplier = 3;

        if (this.size.equals("Personal Sized")) {
            price = 8.50;
            if (this.toppings.contains(null)) {
                return price;
            }
            else{
                double toppingsPrice = this.toppings.stream()
                        .mapToDouble(Toppings::getPrice)
                        .reduce(0, (total, num) -> total += num);
                return price + toppingsPrice;
            }
        }
        else if (this.size.equals("Regular Sized")) {
            price = 12;
            if (this.toppings.contains(null)) {
                return price;
            }
            else {
                double toppingsPrice = this.toppings.stream()
                        .mapToDouble(toppings -> toppings.getPrice() * regularMultiplier)
                        .reduce(0, (total, num) -> total += num);
                return price + toppingsPrice;
            }
        }
        else {
            price = 16.50;
            if (this.toppings.contains(null)) {
                return price;
            }
            else {
                double toppingsPrice = this.toppings.stream()
                        .mapToDouble(toppings -> toppings.getPrice() * largeMultiplier)
                        .reduce(0, (total, num) -> total += num);
                return price + toppingsPrice;
            }
        }
    }
}
