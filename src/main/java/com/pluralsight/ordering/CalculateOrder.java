package com.pluralsight.ordering;

import com.pluralsight.models.MenuItem;
import com.pluralsight.models.Pizza;
import com.pluralsight.ordering.*;
import com.pluralsight.ui.PizzaMenu;

import java.util.ArrayList;
import java.util.List;

public class CalculateOrder {
    static List<MenuItem> checkoutCart = new ArrayList<>();

    public List<MenuItem> addToCart(MenuItem item) {
        checkoutCart.add(item);
        return checkoutCart;
    }

    public static void displayCheckoutCart() {
        String cart = checkoutCart.stream()
                .map(items -> items.getName() + " " + items.getPrice())
                .toString();
        System.out.println(cart);
//        for (MenuItem items : item) {
//            System.out.println(items);
//        }
    }

}
