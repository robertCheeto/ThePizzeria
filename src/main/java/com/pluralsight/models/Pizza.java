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
        return "Pizza Contains: " + "Crust = " + crustType + " | " +
                "Size '" + size + " | " + "Toppings = " + toppings +
                " | " + "Name = " + name + " | " + "Price = " + price;
    }

    @Override
    public double getTotalPrice() {
        // need to start getting prices from the pizza size, and toppings here
        double price = 0;

        if (this.size.equals("Personal Sized")) {
            price = 8.50;
            Double toppingsPrice = this.toppings.stream()
                    .mapToDouble(Toppings::getPrice)
                    .reduce(0, (total, num) -> total += num);
            price += toppingsPrice;
            return price;
        }


//        if (this.size.equals("Personal Sized")) {
//            price = 8.50;
//            if (this.toppings.stream().map(toppings -> toppings.getName().toString()).equals("Pepperoni")) {
//                price += 1.00;
//                if (this.toppings.contains(toppings.get(2))) {
//                    price += 0.75;
//                }
//            }
//        }
//        else if (this.size.equals("Regular Sized")) {
//            price = 12;
//        }
//        else {
//            price = 16.50;
//        }
        return price;
    }
}
