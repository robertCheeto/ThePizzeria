package com.pluralsight.ordering;

import com.pluralsight.models.Pizza;
import com.pluralsight.models.Toppings;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {

    static ArrayList<Pizza> pizzaOrders = new ArrayList<>();

    public static Pizza buildPizza(String name, String size, double price, String crustType, List<Toppings> toppings) {
        Pizza newPizza = new Pizza(name, size, price, crustType, toppings);
        pizzaOrders.add(newPizza);

        return newPizza;
    }


}
