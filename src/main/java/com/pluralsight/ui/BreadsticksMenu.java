package com.pluralsight.ui;

import com.pluralsight.models.Breadsticks;
import com.pluralsight.ordering.CalculateOrder;

public class BreadsticksMenu {
    private static final HomeScreen ui = new HomeScreen();
    private static CalculateOrder calculateOrder;
    private static final boolean isRunning = true;

    public BreadsticksMenu(CalculateOrder cart) {
        calculateOrder = cart;
    }

    public static void buildSticks() {
        String name = "Sticks";
        Breadsticks breadsticks = new Breadsticks(name, 1.50);

        breadsticks.setType(displayBreadstickMenu());

        breadsticks = new Breadsticks(breadsticks.getType(), breadsticks.getTotalPrice(), breadsticks.getType());

        Utilities.waitForEnter();
        calculateOrder.addToCart(breadsticks);
        Utilities.clearScreen();
        ui.displayOrderMenu();
    }

    public static void breadstickOptions() {
        System.out.println("What kind of Breadsticks do you want?\nAll Breadstick types are $1.50!");
        System.out.println("1) Breadsticks (6-count)");
        System.out.println("2) Cheesey-Breadsticks (6-count)");
        System.out.println("3) Garlic Knots (12-count)");
    }

    public static String displayBreadstickMenu() {
        breadstickOptions();

        while (isRunning) {
            int userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Regular Breadsticks (6-count)");
                    return "Breadsticks";
                }
                case 2 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Cheesey-Breadsticks (6-count)");
                    return "Cheesey-Breadsticks";
                }
                case 3 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Garlic Knots (12-count)");
                    return "Garlic Knots";
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }
}
