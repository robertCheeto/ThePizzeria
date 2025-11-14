package com.pluralsight.ui;

import com.pluralsight.models.Pizza;
import com.pluralsight.models.Toppings;
import com.pluralsight.ordering.CalculateOrder;

import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private static final HomeScreen ui = new HomeScreen();
    private static CalculateOrder calculateOrder;
    private static int userInput;
    private static final boolean isRunning = true;

    public PizzaMenu(CalculateOrder cart) {
        calculateOrder = cart;
    }

    public static void buildPizza() {
        String name = Utilities.getUserString("Who is the pizza for: ");
        Utilities.clearScreen();
        Pizza pizza = new Pizza(name, 0);

        pizza.setSize(displayPizzaSizeMenu());
        pizza.setCrustType(displayPizzaCrustMenu());
        pizza.setToppings(displayAllToppings());

        pizza = new Pizza(name, pizza.getSize(), pizza.getPrice(), pizza.getCrustType(), pizza.getToppings());

        Utilities.waitForEnter();
        calculateOrder.addToCart(pizza);
        Utilities.clearScreen();
        ui.displayOrderMenu();
    }

    public static void pizzaSizeMenu() {
        System.out.println("What size pizza do you want?");
        System.out.println("1) Personal 8\" ($8.50)");
        System.out.println("2) Regular 12\" ($12.00)");
        System.out.println("3) Large 16\" ($16.50)");
    }

    public static String displayPizzaSizeMenu() {
        pizzaSizeMenu();

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected a Personal Sized Pizza!\n");
                    return "Personal Sized";
                }
                case 2 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected a Regular Sized Pizza!\n");
                    return "Regular Sized";
                }
                case 3 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected a Large Sized Pizza!\n");
                    return "Large Sized";
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void pizzaCrustMenu() {
        System.out.println("What type of crust do you want on your pizza?");
        System.out.println("1) Thin Crust");
        System.out.println("2) Regular Crust");
        System.out.println("3) Thick Crust");
        System.out.println("4) Cauliflower Crust");
    }

    public static String displayPizzaCrustMenu() {
        pizzaCrustMenu();

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Thin Crust!\n");
                    return "Thin Crust";
                }
                case 2 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Regular Crust!\n");
                    return "Regular Crust";
                }
                case 3 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Thick Crust!\n");
                    return "Thick Crust";
                }
                case 4 -> {
                    Utilities.clearScreen();
                    System.out.println("You selected Cauliflower Crust!\n");
                    return "Cauliflower Crust";
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static List<Toppings> displayAllToppings() {
        List<Toppings> toppingsList = new ArrayList<>();

        System.out.println("Time to select your toppings!");
        toppingsList.add(displaySaucesMenu());
        toppingsList.add(displayCheeseToppingsMenu());
        toppingsList.add(displayMeatToppingsMenu());
        toppingsList.add(displayRegularToppingsMenu());

        System.out.println("Would you like extra toppings on your pizza?");
        String userString = Utilities.getSpecificString("Enter input here (Y/N): ");

        if (userString.equalsIgnoreCase("y")) {
            toppingsList.add(displayExtraCheeseMenu());
            toppingsList.add(displayExtraMeatMenu());
            toppingsList.add(displayRegularToppingsMenu());
        }
        else {
            Utilities.clearScreen();
            System.out.println("Mama Mia!\n");
        }

        toppingsList.add(displayAddOnsMenu());

        for (int i = 0; i < toppingsList.size(); i++) {
            toppingsList.remove(null);
        }

        return toppingsList;
    }

    public static void pizzaSaucesMenu() {
        System.out.println("Do you want sauce on your pizza?");
        System.out.println("1) Marinara");
        System.out.println("2) Alfredo");
        System.out.println("3) Pesto");
        System.out.println("4) BBQ");
        System.out.println("5) Buffalo");
        System.out.println("6) Olive Oil");
        System.out.println("0) No Sauce");
    }

    public static Toppings displaySaucesMenu() {
        Toppings sauce;
        pizzaSaucesMenu();

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    sauce = (new Toppings("Marinara", 0));
                    Utilities.clearScreen();
                    System.out.println("Marinara has been added!\n");
                    return sauce;
                }
                case 2 -> {
                    sauce = (new Toppings("Alfredo", 0));
                    Utilities.clearScreen();
                    System.out.println("Alfredo has been added!\n");
                    return sauce;
                }
                case 3 -> {
                    sauce = new Toppings("Pesto", 0);
                    Utilities.clearScreen();
                    System.out.println("Pesto has been added!\n");
                    return sauce;
                }
                case 4 -> {
                    sauce = new Toppings("BBQ", 0);
                    Utilities.clearScreen();
                    System.out.println("BBQ Sauce has been added!\n");
                    return sauce;
                }
                case 5 -> {
                    sauce = new Toppings("Buffalo Sauce", 0);
                    Utilities.clearScreen();
                    System.out.println("Buffalo Sauce has been added!\n");
                    return sauce;
                }
                case 6 -> {
                    sauce = new Toppings("Olive Oil", 0);
                    Utilities.clearScreen();
                    System.out.println("Olive Oil has been added!\n");
                    return sauce;
                }
                case 0 ->  {
                    Utilities.clearScreen();
                    System.out.println("No Sauce was added.\n");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void cheeseToppingsMenu(){
        System.out.println("How about some Cheese?");
        System.out.println("1) Mozzarella | $0.75 / $1.50 / $2.25");
        System.out.println("2) Parmesan | $0.75 / $1.50 / $2.25");
        System.out.println("3) Ricotta | $0.75 / $1.50 / $2.25");
        System.out.println("4) Goat Cheese | $0.75 / $1.50 / $2.25");
        System.out.println("5) Buffalo | $0.75 / $1.50 / $2.25");
        System.out.println("0) No Cheese");
    }

    public static Toppings displayCheeseToppingsMenu() {
        cheeseToppingsMenu();
        Toppings cheese;

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    cheese = new Toppings("Mozzarella", 0.75);
                    Utilities.clearScreen();
                    System.out.println("Mozzarella Cheese has been added!\n");
                    return cheese;
                }
                case 2 -> {
                    cheese = new Toppings("Parmesan", 0.75);
                    Utilities.clearScreen();
                    System.out.println("Parmesan Cheese has been added!\n");
                    return cheese;
                }
                case 3 -> {
                    cheese = new Toppings("Ricotta", 0.75);
                    Utilities.clearScreen();
                    System.out.println("Ricotta Cheese has been added!\n");
                    return cheese;
                }
                case 4 -> {
                    cheese = new Toppings("Goat", 0.75);
                    Utilities.clearScreen();
                    System.out.println("Goat Cheese has been added!\n");
                    return cheese;
                }
                case 5 -> {
                    cheese = new Toppings("Buffalo", 0.75);
                    Utilities.clearScreen();
                    System.out.println("Buffalo Cheese has been added!\n");
                    return cheese;
                }
                case 0 ->  {
                    Utilities.clearScreen();
                    System.out.println("No cheese for you!\n");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void extraCheeseToppingsMenu(){
        System.out.println("More Cheese?");
        System.out.println("1) Mozzarella | $0.30 / $0.60 / $0.90");
        System.out.println("2) Parmesan | $0.30 / $0.60 / $0.90");
        System.out.println("3) Ricotta | $0.30 / $0.60 / $0.90");
        System.out.println("4) Goat Cheese | $0.30 / $0.60 / $0.90");
        System.out.println("5) Buffalo | $0.30 / $0.60 / $0.90");
        System.out.println("0) No Extra Cheese");
    }

    public static Toppings displayExtraCheeseMenu() {
        extraCheeseToppingsMenu();
        Toppings cheese;

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    cheese = new Toppings("Mozzarella", 0.3);
                    Utilities.clearScreen();
                    System.out.println("Extra Mozzarella Cheese has been added");
                    return cheese;
                }
                case 2 -> {
                    cheese = new Toppings("Parmesan", 0.3);
                    Utilities.clearScreen();
                    System.out.println("Extra Parmesan Cheese has been added");
                    return cheese;
                }
                case 3 -> {
                    cheese = new Toppings("Ricotta", 0.3);
                    Utilities.clearScreen();
                    System.out.println("Extra Ricotta Cheese has been added");
                    return cheese;
                }
                case 4 -> {
                    cheese = new Toppings("Goat", 0.3);
                    Utilities.clearScreen();
                    System.out.println("Extra Goat Cheese has been added");
                    return cheese;
                }
                case 5 -> {
                    cheese = new Toppings("Buffalo", 0.3);
                    Utilities.clearScreen();
                    System.out.println("Extra Buffalo Cheese has been added");
                    return cheese;
                }
                case 0 -> {
                    Utilities.clearScreen();
                    System.out.println("No extra cheese for you!");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void meatToppingsMenu() {
        System.out.println("Do you want any meats?");
        System.out.println("1) Pepperoni | $1.00 / $2.00 / $3.00");
        System.out.println("2) Sausage | $1.00 / $2.00 / $3.00");
        System.out.println("3) Ham | $1.00 / $2.00 / $3.00");
        System.out.println("4) Bacon | $1.00 / $2.00 / $3.00");
        System.out.println("5) Chicken | $1.00 / $2.00 / $3.00");
        System.out.println("6) Meatball | $1.00 / $2.00 / $3.00");
        System.out.println("0) No Meat");
    }

    public static Toppings displayMeatToppingsMenu() {
        meatToppingsMenu();
        Toppings meat;

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    meat = new Toppings("Pepperoni", 1);
                    Utilities.clearScreen();
                    System.out.println("Pepperoni has been added!\n");
                    return meat;
                }
                case 2 -> {
                    meat = (new Toppings("Sausage", 1));
                    Utilities.clearScreen();
                    System.out.println("Sausage has been added!\n");
                    return meat;
                }
                case 3 -> {
                    meat = (new Toppings("Ham", 1));
                    Utilities.clearScreen();
                    System.out.println("Ham has been added!\n");
                    return meat;
                }
                case 4 -> {
                    meat = (new Toppings("Bacon", 1));
                    Utilities.clearScreen();
                    System.out.println("Bacon has been added!\n");
                    return meat;
                }
                case 5 -> {
                    meat = (new Toppings("Chicken", 1));
                    Utilities.clearScreen();
                    System.out.println("Chicken has been added!\n");
                    return meat;
                }
                case 6 -> {
                    meat = (new Toppings("Meatballs", 1));
                    Utilities.clearScreen();
                    System.out.println("Meatballs have been added!\n");
                    return meat;
                }
                case 0 -> {
                    Utilities.clearScreen();
                    System.out.println("No meats were added.\n");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void extraMeatToppingsMenu() {
        System.out.println("Do you want any meats?");
        System.out.println("1) Pepperoni | $0.50 / $1.00 / $1.50");
        System.out.println("2) Sausage | $0.50 / $1.00 / $1.50");
        System.out.println("3) Ham | $0.50 / $1.00 / $1.50");
        System.out.println("4) Bacon | $0.50 / $1.00 / $1.50");
        System.out.println("5) Chicken | $0.50 / $1.00 / $1.50");
        System.out.println("6) Meatball | $0.50 / $1.00 / $1.50");
        System.out.println("0) No Meat");
    }

    public static Toppings displayExtraMeatMenu() {
        extraMeatToppingsMenu();
        Toppings meat;

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    meat = new Toppings("Pepperoni", 0.5);
                    Utilities.clearScreen();
                    System.out.println("Pepperoni has been added");
                    return meat;
                }
                case 2 -> {
                    meat = (new Toppings("Sausage", 0.5));
                    Utilities.clearScreen();
                    System.out.println("Sausage has been added");
                    return meat;
                }
                case 3 -> {
                    meat = (new Toppings("Ham", 0.5));
                    Utilities.clearScreen();
                    System.out.println("Ham has been added");
                    return meat;
                }
                case 4 -> {
                    meat = (new Toppings("Bacon", 0.5));
                    Utilities.clearScreen();
                    System.out.println("Bacon has been added");
                    return meat;
                }
                case 5 -> {
                    meat = (new Toppings("Chicken", 0.5));
                    Utilities.clearScreen();
                    System.out.println("Chicken has been added");
                    return meat;
                }
                case 6 -> {
                    meat = (new Toppings("Meatballs", 0.5));
                    Utilities.clearScreen();
                    System.out.println("Meatballs have been added");
                    return meat;
                }
                case 0 -> {
                    Utilities.clearScreen();
                    System.out.println("No extra meats were added.");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void regularToppingsMenu() {
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
        System.out.println("0) No extra toppings");
    }

    public static Toppings displayRegularToppingsMenu() {
        regularToppingsMenu();
        Toppings extras;

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    extras = new Toppings("Onions", 0);
                    Utilities.clearScreen();
                    System.out.println("Onions have been added!\n");
                    return extras;
                }
                case 2 -> {
                    extras = new Toppings("Mushrooms", 0);
                    Utilities.clearScreen();
                    System.out.println("Mushrooms have been added!\n");
                    return extras;
                }
                case 3 -> {
                    extras = new Toppings("Bell Peppers", 0);
                    Utilities.clearScreen();
                    System.out.println("Bell Peppers have been added!\n");
                    return extras;
                }
                case 4 -> {
                    extras = new Toppings("Olives", 0);
                    Utilities.clearScreen();
                    System.out.println("Olives have been added!\n");
                    return extras;
                }
                case 5 -> {
                    extras = new Toppings("Tomatoes", 0);
                    Utilities.clearScreen();
                    System.out.println("Tomatoes have been added!\n");
                    return extras;
                }
                case 6 -> {
                    extras = new Toppings("Spinach", 0);
                    Utilities.clearScreen();
                    System.out.println("Spinach has been added!\n");
                    return extras;
                }
                case 7 -> {
                    extras = new Toppings("Basil", 0);
                    Utilities.clearScreen();
                    System.out.println("Basil has been added!\n");
                    return extras;
                }
                case 8 -> {
                    extras = new Toppings("Pineapples\n", 0);
                    Utilities.clearScreen();
                    System.out.println("Pineapples have been added (even though they don't belong!)");
                    return extras;
                }
                case 9 -> {
                    extras = new Toppings("Anchovies!\n", 0.3);
                    Utilities.clearScreen();
                    System.out.println("Anchovies have been added");
                    return extras;
                }
                case 0 -> {
                    Utilities.clearScreen();
                    System.out.println("No extra toppings were added.\n");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }

    public static void pizzaAddOnMenu() {
        System.out.println("Any side addons?");
        System.out.println("1) Red Pepper Flake Packet");
        System.out.println("2) Parmesan Cheese Packet");
        System.out.println("0) No Packets");
    }

    public static Toppings displayAddOnsMenu() {
        pizzaAddOnMenu();
        Toppings addOns;

        while (isRunning) {
            userInput = Utilities.getUserIntInput("Input option here: ");

            switch (userInput) {
                case 1 -> {
                    addOns = new Toppings("Red Pepper Flakes", 0);
                    Utilities.clearScreen();
                    System.out.println("A Packet of Red Pepper Flakes has been added!");
                    return addOns;
                }
                case 2 -> {
                    addOns = new Toppings("Packet of Parmesan Cheese!", 0);
                    Utilities.clearScreen();
                    System.out.println("A Packet of Parmesan Cheese has been added");
                    return addOns;
                }
                case 0 -> {
                    Utilities.clearScreen();
                    System.out.println("No packets were added");
                    return null;
                }
                default -> System.out.println("\nPlease enter a valid input...");
            }
        }
    }
}
