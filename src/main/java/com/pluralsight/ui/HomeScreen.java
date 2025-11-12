package com.pluralsight.ui;

import com.pluralsight.ordering.CalculateOrder;
import com.pluralsight.ordering.ReceiptGenerator;

import static com.pluralsight.ordering.ReceiptGenerator.displayReceipt;

public class HomeScreen {
    private static CalculateOrder cart = new CalculateOrder();
    private static final PizzaMenu pizza = new PizzaMenu(cart);
    private static final boolean isRunning = true;

    public void displayHome() {
        homeScreenMenu();

        while (isRunning) {
            int userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> displayOrderMenu();
                case 2 -> displayCheckOutCart();
                case 3 -> {
                    System.out.println("Thank you for ordering!\nHere is a copy of your receipt!");
                    displayCheckOutReceipt();
                    displayReceipt();
                }
                case 0 -> Utilities.exitProgram();
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
    }

    public void homeScreenMenu() {
        System.out.println("*** Welcome to Spezialetti's Pizzeria ***");
        System.out.println("1) New Order\n2) Cart\n3) Checkout\n0) Exit");
    }

    public void orderScreenMenu() {
        Utilities.clearScreen();
        System.out.println("*** ORDER UP! ***");
        System.out.println("1) Add Pizza");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Breadsticks");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
    }

    public void displayOrderMenu() {
        orderScreenMenu();

        while (isRunning) {

            int userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    System.out.println("Adding Pizza to cart...");
                    Utilities.clearScreen();
                    PizzaMenu.buildPizza();
                }
                case 2 -> {
                    System.out.println("Adding Drink to cart...");
                    Utilities.clearScreen();
                    //DrinkMenu.buildDrink();
                    System.out.println("Need to start building the Drink Method");
                }
                case 3 -> {
                    System.out.println("Adding Breadsticks to cart...");
                    Utilities.clearScreen();
                    //BreadsticksMenu.addBreadsticks();
                    // need to see if I can just get away with adding breadsticks
                    // could do a "custom" option where the user selects regular
                    //breadsticks, cheese-filled sticks, etc.
                    System.out.println("Need to start building the breadsticks method");
                }
                case 4 -> {
                    System.out.println("Loading checkout menu...");
                    Utilities.clearScreen();
                    System.out.println("Need to build out this check out menu");
                }
                case 0 -> {
                    System.out.println("\nReturning to Home Screen...");
                    // maybe add logic to wait before clearing screen and showing the home menu
                    displayHome();
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
    }

    public void checkOutCart() {
        Utilities.clearScreen();
        CalculateOrder.displayCheckoutCart();
    }

    public void displayCheckOutCart() {
        checkOutCart();
    }

    public void displayCheckOutReceipt() {
        ReceiptGenerator.printReceipt(cart);
    }

}
