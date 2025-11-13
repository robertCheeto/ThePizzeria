package com.pluralsight.ordering;

import com.pluralsight.models.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CalculateOrder {
    static List<MenuItem> checkoutCart = new ArrayList<>();

    public void addToCart(MenuItem item) {
        checkoutCart.add(item);
    }

    public static void displayCheckoutCart() {
        System.out.println("*** Your Cart ***\n");

        for (MenuItem item : checkoutCart) {
            System.out.printf("- %s | $%.2f\n\n",item.toString(), item.getTotalPrice());
        }

        System.out.print("\nTotal: $");
        getFinalPrice();
        System.out.println("**********");
    }

    public static void getFinalPrice() {
        double finalPrice = 0;

        for (MenuItem price : checkoutCart) {
            finalPrice += price.getTotalPrice();
        }
        System.out.printf("%.2f\n", finalPrice);
    }

    public List<MenuItem> getCheckOutCart() {
         return checkoutCart;
    }

    public static void emptyCart() {
        for (int i = 0; i < checkoutCart.size(); i++) {
            checkoutCart.clear();
        }
    }
}
