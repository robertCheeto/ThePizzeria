package com.pluralsight.ordering;

import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Pizza;
import com.pluralsight.ordering.*;
import com.pluralsight.ui.PizzaMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateOrder {
    static List<MenuItem> checkoutCart = new ArrayList<>();

    public List<MenuItem> addToCart(MenuItem item) {
        checkoutCart.add(item);
        return checkoutCart;
    }

    public static void displayCheckoutCart() {
        String cart = checkoutCart.stream()
                .map(checkoutCart -> checkoutCart.getName() + " " + checkoutCart.getTotalPrice())
                .collect(Collectors.joining(" "));
        System.out.println(cart);
        // order will print out but it is very primiative
    }

}
