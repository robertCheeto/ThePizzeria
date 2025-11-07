package com.pluralsight.ui;

public class PizzaMenu {

    public static void displayPizzaMenu() {
        pizzaCrustMenu();
        pizzaToppingsMenu();

    }

    public static void pizzaCrustMenu() {
        System.out.println("What type of crust do you want on your pizza?");
        System.out.println("1) Thin Crust");
        System.out.println("2) Regular Crust");
        System.out.println("3) Thick Crust");
        System.out.println("4) Cauliflower Crust");
        System.out.print("Input option here: ");
    }

    public static void pizzaToppingsMenu() {
        System.out.println("Do you want any meats?");
        System.out.println("1) Pepperoni");
        System.out.println("2) Sausage");
        System.out.println("3) Ham");
        System.out.println("4) Bacon");
        System.out.println("5) Chicken");
        System.out.println("6) Meatball");

        System.out.println();

        System.out.println("How about some Cheese?");
        System.out.println("1) Mozzarella");
        System.out.println("2) Parmesan");
        System.out.println("3) Ricotta");
        System.out.println("4) Goat Cheese");
        System.out.println("5) Buffalo");

        System.out.println();

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

        System.out.println();

        System.out.println("Any extra sauce?");
        System.out.println("1) Marinara");
        System.out.println("2) Alfredo");
        System.out.println("3) Pesto");
        System.out.println("4) BBQ");
        System.out.println("5) Buffalo");
        System.out.println("6) Olive Oil");

        System.out.println();

        System.out.println("Any side addons?");
        System.out.println("1) Red Peppers Flake Packet");
        System.out.println("2) Parmesan Cheese Packet");
    }

}
