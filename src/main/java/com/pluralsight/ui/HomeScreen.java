package com.pluralsight.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeScreen {
    private Scanner keyboard = new Scanner(System.in);

    public void displayHome() {
        boolean isRunning = true;
        int userInput;
        homeScreenMenu();

        while (isRunning) {
            // try-catch will end the loop if the user inputs a char/string
            // need to find way to get the program to continue to run if this happens
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("Starting new order...");
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

    public void orderMenu() {
        clearScreen();
        System.out.println("");
    }

}
