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
        System.out.println("4) View Cart");
        System.out.println("5) Checkout");
        System.out.println("0) Cancel Order\n**NEED TO ADD LOGIC THAT EMPTIES THE CART**");
    }

    public void displayOrderMenu() {
        while (isRunning) {
            orderScreenMenu();
            int userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    Utilities.clearScreen();
                    System.out.println("Adding Pizza to cart...\n");
                    PizzaMenu.buildPizza();
                }
                case 2 -> {
                    Utilities.clearScreen();
                    System.out.println("Adding Drink to cart...\n");
                    DrinkMenu.buildDrink();
                }
                case 3 -> {
                    Utilities.clearScreen();
                    System.out.println("Adding Breadsticks to cart...\n");
                    BreadsticksMenu.buildSticks();
                }
                case 4 -> {
                    Utilities.clearScreen();
                    if (cart.getCheckOutCart().isEmpty()) {
                        System.out.println("Your cart is currently empty!");
                        Utilities.pressEnterToContinue();
                    }
                    else {
                        System.out.println("Loading cart...\n");
                        displayCart();
                        Utilities.pressEnterToContinue();
                    }
                }
                case 5 -> {
                    Utilities.clearScreen();
                    if (cart.getCheckOutCart().isEmpty()) {
                        System.out.println("You cannot check out because you do not have anything in your cart!");
                        Utilities.pressEnterToContinue();
                    }
                    else {
                        System.out.println("Thank you for ordering! Here is a copy of your receipt!\n");
                        printCheckOutReceipt();
                        displayReceipt();
                        Utilities.pressEnterToContinue();
                        Utilities.exitProgram();
                    }
                }
                case 0 -> {
                    //CalculateOrder.emptyCart();
                    Utilities.clearScreen();
                    System.out.println("Returning to Home Screen...\n");
                    displayHome();
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
    }

    public void displayCart() {
        CalculateOrder.displayCheckoutCart();
    }

    public void printCheckOutReceipt() {
        ReceiptGenerator.printReceipt(cart);
    }

}
