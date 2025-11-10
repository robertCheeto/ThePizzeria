package com.pluralsight.ui;

import com.pluralsight.models.Pizza;
import com.pluralsight.models.Toppings;
import com.pluralsight.ordering.PizzaOrder;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PizzaMenu {
    private static final Scanner keyboard = new Scanner(System.in);
    private static int userInput;
    private static final boolean isRunning = true;

    public static void displayPizzaMenu() {
        Pizza pizza = PizzaOrder.buildPizza("Pie 1", displayPizzaSizeMenu(), 10.99, displayPizzaCrustMenu(), displayAllToppings());
        System.out.println(pizza);
        //System.out.printf("You ordered a pizza with the following:\nCrust: %s\nSize: %s\nToppings: %s", pizza.getCrustType(), pizza.getSize(), pizza.getToppings());
    }

    public static String displayPizzaSizeMenu() {
        pizzaSizeMenu();

        while (isRunning) {
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 -> {
                    System.out.println("You selected a Personal Sized Pizza");
                    //displayPizzaMeatToppingsMenu();
                    return "Personal Sized";
                }
                case 2 -> {
                    System.out.println("You selected a Regular Sized Pizza");
                    return "Regular Sized";
                }
                case 3 -> {
                    System.out.println("You selected a Large Sized Pizza");
                    return "Large Sized";
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
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

    public static String displayPizzaCrustMenu() {
        pizzaCrustMenu();

        while (isRunning) {
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 -> {
                    System.out.println("You selected Thin Crust");
                    return "Thin Crust";
                }
                case 2 -> {
                    System.out.println("You selected Regular Crust");
                    return "Regular Crust";
                }
                case 3 -> {
                    System.out.println("You selected Thick Crust");
                    return "Thick Crust";
                }
                case 4 -> {
                    System.out.println("You selected Cauliflower Crust");
                    return "Cauliflower Crust";
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
    }

    public static void pizzaCrustMenu() {
        System.out.println("What type of crust do you want on your pizza?");
        System.out.println("1) Thin Crust");
        System.out.println("2) Regular Crust");
        System.out.println("3) Thick Crust");
        System.out.println("4) Cauliflower Crust");
        System.out.print("Input option here: ");
    }

    public static List<Toppings> displayAllToppings() {
        List<Toppings> toppingsList = new ArrayList<>();

        System.out.println("Time to select your toppings!");
        System.out.println("You must select a Sauce before adding other toppings like Cheese, Meats, etc.");
        toppingsList.add(displaySaucesMenu());
        toppingsList.add(displayCheeseToppingsMenu());
        toppingsList.add(displayPizzaMeatToppingsMenu());
        toppingsList.add(displayExtraToppingsMenu());

        return toppingsList;
    }

    public static Toppings displaySaucesMenu() {
        Toppings sauce;
        pizzaSaucesMenu();

        while (isRunning) {
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 ->
                {
                    sauce = (new Toppings("Marinara", 0));
                    System.out.println("Marinara has been added");
                    return sauce;
                }
                case 2 ->
                {
                    sauce = (new Toppings("Alferdo", 0));
                    System.out.println("Alfredo has been added");
                    return sauce;
                }
                case 3 -> {
                    sauce = new Toppings("Pesto", 0);
                    System.out.println("Pesto has been added");
                    return sauce;
                }
                case 4 -> {
                    sauce = new Toppings("BBQ", 0);
                    System.out.println("BBQ Sauce has been added");
                    return sauce;
                }
                case 5 -> {
                    sauce = new Toppings("Buffalo Sauce", 0);
                    System.out.println("Buffalo Sauce has been added");
                    return sauce;
                }
                case 6 -> {
                    sauce = new Toppings("Olive Oil", 0);
                    System.out.println("Olive Oil has been added");
                    return sauce;
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
    }

    public static void pizzaSaucesMenu() {
        System.out.println("Any extra sauce?");
        System.out.println("1) Marinara");
        System.out.println("2) Alfredo");
        System.out.println("3) Pesto");
        System.out.println("4) BBQ");
        System.out.println("5) Buffalo");
        System.out.println("6) Olive Oil");
        System.out.print("Enter input here: ");
    }

    public static Toppings displayCheeseToppingsMenu() {
        pizzaCheeseToppingsMenu();
        Toppings cheese;

        while (isRunning) {
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 -> {
                    cheese = new Toppings("Mozzarella", 0);
                    System.out.println("Mozzarella Cheese has been added");
                    return cheese;
                }
                case 2 -> {
                    cheese = new Toppings("Parmesan", 0);
                    System.out.println("Parmesan Cheese has been added");
                    return cheese;
                }
                case 3 -> {
                    cheese = new Toppings("Ricotta", 0);
                    System.out.println("Ricotta Cheese has been added");
                    return cheese;
                }
                case 4 -> {
                    cheese = new Toppings("Goat", 0);
                    System.out.println("Goat Cheese has been added");
                    return cheese;
                }
                case 5 -> {
                    cheese = new Toppings("Buffalo", 0);
                    System.out.println("Buffalo Cheese has been added");
                    return cheese;
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
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

    public static Toppings displayPizzaMeatToppingsMenu() {
        pizzaMeatToppingsMenu();
        Toppings meat;

        while (isRunning) {
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 -> {
                    meat = new Toppings("Pepperoni", 0.5);
                    System.out.println("Pepperoni has been added");
                    return meat;
                }
                case 2 -> {
                    meat = (new Toppings("Sausage", 0.56));
                    System.out.println("Sausage has been added");
                    return meat;
                }
                case 3 -> {
                    meat = (new Toppings("Ham", 0.5));
                    System.out.println("Ham has been added");
                    return meat;
                }
                case 4 -> {
                    meat = (new Toppings("Bacon", 0.5));
                    System.out.println("Bacon has been added");
                    return meat;
                }
                case 5 -> {
                    meat = (new Toppings("Chicken", 0.5));
                    System.out.println("Chicken has been added");
                    return meat;
                }
                case 6 -> {
                    meat = (new Toppings("Meatballs", 0.5));
                    System.out.println("Meatballs have been added");
                    return meat;
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
            }
        }
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

    public static Toppings displayExtraToppingsMenu() {
        pizzaExtraToppingsMenu();
        Toppings extras;

        while (isRunning) {
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            switch (userInput) {
                case 1 -> {
                    extras = new Toppings("Onions", 0.5);
                    System.out.println("Onions have been added");
                    return extras;
                }
                case 2 -> {
                    extras = new Toppings("Mushrooms", 0.5);
                    System.out.println("Mushrooms have been added");
                    return extras;
                }
                case 3 -> {
                    extras = new Toppings("Bell Peppers", 0.5);
                    System.out.println("Bell Peppers have been added");
                    return extras;
                }
                case 4 -> {
                    extras = new Toppings("Olives", 0.5);
                    System.out.println("Olives have been added");
                    return extras;
                }
                case 5 -> {
                    extras = new Toppings("Tomatoes", 0.5);
                    System.out.println("Tomatoes have been added");
                    return extras;
                }
                case 6 -> {
                    extras = new Toppings("Spinach", 0.5);
                    System.out.println("Spinach has been added");
                    return extras;
                }
                case 7 -> {
                    extras = new Toppings("Basil", 0.5);
                    System.out.println("Basil has been added");
                    return extras;
                }
                case 8 -> {
                    extras = new Toppings("Pineapples", 0.5);
                    System.out.println("Pineapples have been added (even though they don't belong!)");
                    return extras;
                }
                case 9 -> {
                    extras = new Toppings("Anchovies", 0.5);
                    System.out.println("Anchovies have been added");
                    return extras;
                }
                default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
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

//    public static void displayAddOnsMenu() {
//        pizzaAddOnMenu();
//
//        while (isRunning) {
//            try {
//                userInput = keyboard.nextInt();
//                keyboard.nextLine();
//
//                switch (userInput) {
//                    case 1 -> System.out.println("A Packet of Red Pepper Flakes has been added");
//                    case 2 -> System.out.println("A Packet of Parmesan Cheese has been added");
//                    default -> System.out.print("\nPlease enter a valid input...\nEnter input here: ");
//                }
//
//            } catch (InputMismatchException e) {
//                System.out.println("Please enter a number...");
//                break;
//            }
//        }
//    }
//
//    public static void pizzaAddOnMenu() {
//        System.out.println("Any side addons?");
//        System.out.println("1) Red Pepper Flake Packet");
//        System.out.println("2) Parmesan Cheese Packet");
//        System.out.print("Enter input here: ");
//    }
}
