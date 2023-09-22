package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        PizzaFactory meatPizzaFactory = new MeatPizzaFactory();
        PizzaFactory pepperoniPizzaStore = new PepperoniPizzaFactory();

        System.out.println("Order for cheese Pizza");
        Pizza cheesePizza = cheesePizzaFactory.orderPizza("cheese");
        System.out.println();

        System.out.println("Order for meat Pizza");
        Pizza meatPizza = meatPizzaFactory.orderPizza("meat");
        System.out.println();

        System.out.println("Order for pepperoni Pizza");
        Pizza pepperoniPizza = pepperoniPizzaStore.orderPizza("pepperoni");



    }
}