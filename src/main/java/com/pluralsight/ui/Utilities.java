package com.pluralsight.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final String RETURN_TO_MENU_MESSAGE = "\nPress Enter to return to menu!";
    private static final String PRESS_ENTER_TO_CONTINUE = "\nPress Enter to Continue!";
    private static final int INVALID_INPUT = -1;

    public static int getUserInput() {
        try {
            int userInput = keyboard.nextInt();
            keyboard.nextLine();
            return userInput;
        } catch (InputMismatchException e) {
            keyboard.nextLine();
            return INVALID_INPUT;
        }
    }

    public static int getUserIntInput(String prompt) {
        System.out.print(prompt);
        return getUserInput();
    }

    public static String getUserString(String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine().trim();
    }

    public static String getSpecificString(String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine().toLowerCase().trim();
    }

    public static void waitForEnter() {
        System.out.print(RETURN_TO_MENU_MESSAGE);
        keyboard.nextLine();
    }

    public static void pressEnterToContinue() {
        System.out.print(PRESS_ENTER_TO_CONTINUE);
        keyboard.nextLine();
    }

    public static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public static void exitProgram() {
        System.out.println("Program shutting down...");
        keyboard.close();
        System.exit(0);
    }

}
