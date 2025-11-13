package com.pluralsight.ui;

import com.pluralsight.ordering.CalculateOrder;
import com.pluralsight.ordering.ReceiptGenerator;

import static com.pluralsight.ordering.ReceiptGenerator.displayReceipt;

public class HomeScreen {
    private static CalculateOrder cart = new CalculateOrder();
    private static final PizzaMenu pizza = new PizzaMenu(cart);
    private static final DrinkMenu drink = new DrinkMenu(cart);
    private static final BreadsticksMenu breadsticks = new BreadsticksMenu(cart);
    private static final boolean isRunning = true;

    public void homeScreen() {
        System.out.println("*** Welcome to Spezialetti's Pizzeria ***");
        System.out.println("1) New Order\n0) Exit");
    }

    public void displayHome() {
        homeScreen();

        while (isRunning) {
            int userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> displayOrderMenu();
                case 0 -> Utilities.exitProgram();
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
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
                    DrinkMenu.buildDrink();
                }
                case 3 -> {
                    System.out.println("Adding Breadsticks to cart...");
                    Utilities.clearScreen();
                    BreadsticksMenu.buildSticks();
                }
                case 4 -> {
                    Utilities.clearScreen();
                    System.out.println("Thank you for ordering! Here is a copy of your receipt!\n");
                    displayCheckOutReceipt();
                    displayReceipt();
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

//    public void checkOutCart() {
//        Utilities.clearScreen();
//        CalculateOrder.displayCheckoutCart();
//    }
//
//    public void displayCheckOutCart() {
//        checkOutCart();
//    }

    public void displayCheckOutReceipt() {
        ReceiptGenerator.printReceipt(cart);
    }

}
