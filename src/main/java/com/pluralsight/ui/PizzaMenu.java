package com.pluralsight.ui;

import com.pluralsight.models.Pizza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaMenu {
    private static final Scanner keyboard = new Scanner(System.in);
    private static int userInput;
    private static final boolean isRunning = true;

    public static void displayPizzaMenu() {
        displayPizzaSizeMenu();
    }

    public static void displayPizzaSizeMenu() {
        pizzaSizeMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> {
                        System.out.println("You selected a Personal Sized Pizza");
                        displayPizzaMeatToppingsMenu();
                        //return "Thin Crust";
                    }
                    case 2 -> {
                        System.out.println("You selected a Regular Sized Pizza");
                        //return "Regular Crust";
                    }
                    case 3 -> {
                        System.out.println("You selected a Large Sized Pizza");
                        //return "Thick Crust";
                    }
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }

    }

    public static void pizzaSizeMenu() {
        System.out.println("What size pizza do you want?");
        System.out.println("1) Personal 8\" ($8.50)");
        System.out.println("2) Regular 12\" ($12.00)");
        System.out.println("3) Large 16\" ($16.50)");
        System.out.print("Input option here: ");
    }

    public static int displayPizzaCrustMenu() {
        pizzaCrustMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> {
                        System.out.println("You selected Thin Crust");
                        displayPizzaMeatToppingsMenu();
                        //return "Thin Crust";
                    }
                    case 2 -> {
                        System.out.println("You selected Regular Crust");
                        //return "Regular Crust";
                    }
                    case 3 -> {
                        System.out.println("You selected Thick Crust");
                        //return "Thick Crust";
                    }
                    case 4 -> {
                        System.out.println("You selected Cauliflower Crust");
                        //return "Cauliflower Crust";
                    }
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }
        return userInput;
    }

    public static void pizzaCrustMenu() {
        System.out.println("What type of crust do you want on your pizza?");
        System.out.println("1) Thin Crust");
        System.out.println("2) Regular Crust");
        System.out.println("3) Thick Crust");
        System.out.println("4) Cauliflower Crust");
        System.out.print("Input option here: ");
    }

    public static int displayPizzaMeatToppingsMenu() {
        pizzaMeatToppingsMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("Pepperoni has been added");
                    case 2 -> System.out.println("Sausage has been added");
                    case 3 -> System.out.println("Ham has been added");
                    case 4 -> System.out.println("Bacon has been added");
                    case 5 -> System.out.println("Chicken has been added");
                    case 6 -> System.out.println("Meatballs have been added");
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }
        return userInput;
    }

    public static void pizzaMeatToppingsMenu() {
        System.out.println("Do you want any meats?");
        System.out.println("1) Pepperoni");
        System.out.println("2) Sausage");
        System.out.println("3) Ham");
        System.out.println("4) Bacon");
        System.out.println("5) Chicken");
        System.out.println("6) Meatball");
        System.out.print("Enter input here: ");
    }

    public static void displayCheeseToppingsMenu() {
        pizzaCheeseToppingsMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("Mozzarella Cheese has been added");
                    case 2 -> System.out.println("Parmesan Cheese has been added");
                    case 3 -> System.out.println("Ricotta Cheese has been added");
                    case 4 -> System.out.println("Goat Cheese has been added");
                    case 5 -> System.out.println("Buffalo Cheese has been added");
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }
    }

    public static void pizzaCheeseToppingsMenu(){
        System.out.println("How about some Cheese?");
        System.out.println("1) Mozzarella");
        System.out.println("2) Parmesan");
        System.out.println("3) Ricotta");
        System.out.println("4) Goat Cheese");
        System.out.println("5) Buffalo");
        System.out.print("Enter input here: ");
    }

    public static void displayExtraToppingsMenu() {
        pizzaExtraToppingsMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("Onions have been added");
                    case 2 -> System.out.println("Mushrooms have been added");
                    case 3 -> System.out.println("Bell Peppers have been added");
                    case 4 -> System.out.println("Olives have been added");
                    case 5 -> System.out.println("Tomatoes have been added");
                    case 6 -> System.out.println("Spinach has been added");
                    case 7 -> System.out.println("Basil has been added");
                    case 8 -> System.out.println("Pineapples have been added (even though they don't belong!)");
                    case 9 -> System.out.println("Anchovies have been added");
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }
    }

    public static void pizzaExtraToppingsMenu() {
        System.out.println("Any extra toppings?");
        System.out.println("1) Onions");
        System.out.println("2) Mushrooms");
        System.out.println("3) Bell Peppers");
        System.out.println("4) Olives");
        System.out.println("5) Tomatoes");
        System.out.println("6) Spinach");
        System.out.println("7) Basil");
        System.out.println("8) Pineapple");
        System.out.println("9) Anchovies");
        System.out.print("Enter input here: ");
    }

    public static void displayExtraSaucesMenu() {
        pizzaExtraSaucesMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("Extra Marinara has been added");
                    case 2 -> System.out.println("Extra Alfredo has been added");
                    case 3 -> System.out.println("Extra Pesto has been added");
                    case 4 -> System.out.println("Extra BBQ Sauce has been added");
                    case 5 -> System.out.println("Extra Buffalo Sauce has been added");
                    case 6 -> System.out.println("Olive Oil has been added");
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }
    }

    public static void pizzaExtraSaucesMenu() {
        System.out.println("Any extra sauce?");
        System.out.println("1) Marinara");
        System.out.println("2) Alfredo");
        System.out.println("3) Pesto");
        System.out.println("4) BBQ");
        System.out.println("5) Buffalo");
        System.out.println("6) Olive Oil");
        System.out.print("Enter input here: ");
    }

    public static void displayAddOnsMenu() {
        pizzaAddOnMenu();

        while (isRunning) {
            try {
                userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1 -> System.out.println("A Packet of Red Pepper Flakes has been added");
                    case 2 -> System.out.println("A Packet of Parmesan Cheese has been added");
                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number...");
                break;
            }
        }
    }

    public static void pizzaAddOnMenu() {
        System.out.println("Any side addons?");
        System.out.println("1) Red Pepper Flake Packet");
        System.out.println("2) Parmesan Cheese Packet");
        System.out.print("Enter input here: ");
    }

}
