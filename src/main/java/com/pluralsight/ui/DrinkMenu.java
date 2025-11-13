package com.pluralsight.ui;

import com.pluralsight.models.Drink;
import com.pluralsight.ordering.CalculateOrder;

public class DrinkMenu {
    private static final HomeScreen ui = new HomeScreen();
    private static CalculateOrder calculateOrder;
    private static int userInput;
    private static final boolean isRunning = true;

    public DrinkMenu(CalculateOrder cart) {
        calculateOrder = cart;
    }

    public static void buildDrink() {
        String name = "Drink";
        Drink drink = new Drink(name, 0);

        drink.setSize(displaySizeMenu());
        drink.setFlavor(displayFlavorMenu());

        drink = new Drink(name, drink.getPrice(), drink.getFlavor(), drink.getSize());

        Utilities.waitForEnter();
        calculateOrder.addToCart(drink);
        Utilities.clearScreen();
        ui.displayOrderMenu();
    }

    public static void drinkSizes() {
        System.out.println("What size drink would you like?");
        System.out.println("1) Small ($2.00)");
        System.out.println("2) Medium ($2.50)");
        System.out.println("3) Large ($3.00)");
    }

    public static String displaySizeMenu() {
        drinkSizes();

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected a Small Sized Drink!\n");
                    return "Small";
                }
                case 2 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected a Medium Sized Drink!\n");
                    return "Medium";
                }
                case 3 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected a Large Sized Drink!\n");
                    return "Large";
                }
            }
        }
    }

    public static void drinkFlavors() {
        System.out.println("We offer Pepsi Products");
        System.out.println("1) Pepsi");
        System.out.println("2) Diet Pepsi");
        System.out.println("3) Mountain Dew");
        System.out.println("4) Dr. Pepper");
        System.out.println("5) Starry");
        System.out.println("6) MUG Root Beer");
        System.out.println("7) Tropicana Lemonade");
        System.out.println("8) Water");
    }

    public static String displayFlavorMenu() {
        drinkFlavors();

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Pepsi!\n");
                    return "Pepsi";
                }
                case 2 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Diet Pepsi!\n");
                    return "Diet Pepsi";
                }
                case 3 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Mountain Dew!\n");
                    return "Mountain Dew!";
                }
                case 4 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Dr. Pepper!\n");
                    return "Dr. Pepper";
                }
                case 5 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Starry!\n");
                    return "Starry";
                }
                case 6 -> {
                    Utilities.clearScreen();
                    System.out.println("You select MUG Root Beer!\n");
                    return "MUG Root Beer";
                }
                case 7 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Tropicana Lemonade!\n");
                    return "Tropicana Lemonade";
                }
                case 8 -> {
                    Utilities.clearScreen();
                    System.out.println("You select Water!\n");
                    return "Water";
                }
            }
        }
    }

}
