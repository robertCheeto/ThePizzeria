package com.pluralsight.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final String RETURN_TO_MENU_MESSAGE = "\nPress Enter to return to menu";
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
        System.out.println(prompt);
        return getUserInput();
    }

    public static String getUserString(String promt) {
        System.out.println(promt);
        return keyboard.nextLine();
    }

    public static void waitForEnter() {
        System.out.println(RETURN_TO_MENU_MESSAGE);
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
