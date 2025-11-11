package com.pluralsight.ordering;

import com.pluralsight.models.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CalculateOrder {
    static List<MenuItem> checkoutCart = new ArrayList<>();

    public List<MenuItem> addToCart(MenuItem item) {
        checkoutCart.add(item);
        return checkoutCart;
    }

    public static void displayCheckoutCart() {
        for (MenuItem item : checkoutCart) {
            System.out.printf(String.valueOf(item));
            System.out.println();
            System.out.printf("$%.2f",item.getTotalPrice());
        }
        System.out.print("\n\nTotal: $");
        getFinalPrice();
    }

    public static void getFinalPrice() {
        double finalPrice = 0;

        for (MenuItem price : checkoutCart) {
            finalPrice += price.getTotalPrice();
        }
        System.out.println(finalPrice);
    }

    public List<MenuItem> getCheckOutCart() {
         return checkoutCart;
    }

}
