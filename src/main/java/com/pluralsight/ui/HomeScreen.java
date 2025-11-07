package com.pluralsight.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeScreen {
    //should consider making other variables like userInput global
    private static Scanner keyboard = new Scanner(System.in);
    private static int userInput;
    private static final boolean isRunning = true;

    public void displayHome() {
        homeScreenMenu();

        while (isRunning) {
            // try-catch will end the loop if the user inputs a char/string
            // need to find way to get the program to continue to run if this happens
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> displayOrderMenu();
                    case 0 -> {
                        System.out.println("Program shutting down...");
                        keyboard.close();
                        System.exit(0);
                    }
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }


    }

    public void homeScreenMenu() {
        System.out.println("*** Welcome to Spezialetti's Pizzeria ***");
        System.out.println("1) New Order\n0) Exit");
        System.out.print("Input option here: ");

    }

    public void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public void orderScreenMenu() {
        clearScreen();
        System.out.println("*** ORDER UP! ***");
        System.out.println("1) Add Pizza");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Breadsticks");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("Input option here: ");
    }

    public void displayOrderMenu() {
        orderScreenMenu();

        while (isRunning) {
            // try-catch will end the loop if the user inputs a char/string
            // need to find way to get the program to continue to run if this happens
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("Adding Pizza to cart...");
                    case 2 -> System.out.println("Adding Drink to cart...");
                    case 3 -> System.out.println("Adding Breadsticks to cart...");
                    case 4 -> System.out.println("Loading checkout menu...");
                    case 0 -> {
                        System.out.println("\nReturning to Home Screen...");
                        // maybe add logic to wait before clearing screen and showing the home menu
                        displayHome();
                    }
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }

    }

}
