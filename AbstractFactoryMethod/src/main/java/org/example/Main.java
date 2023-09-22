package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PizzaIngredientFactory americanPizzaIngredientFactory = new AmericanPizzaIngredientFactory();
        PizzaFactory americanCheesePizzaFactory = new AmericanCheesePizzaFactory(americanPizzaIngredientFactory);
        PizzaFactory americanPepperoniPizzaFactory = new AmericanPepperoniPizzaFactory(americanPizzaIngredientFactory);

        PizzaStore americanCheesePizzaStore = new PizzaStore(americanCheesePizzaFactory);
        PizzaStore americanPepperoniPizzaStore = new PizzaStore(americanPepperoniPizzaFactory);

        System.out.println("Order for American Cheese Pizza");
        Pizza americanCheesePizza = americanCheesePizzaStore.orderPizza();

        System.out.println();

        System.out.println("Order for American Pepperoni Pizza");
        Pizza americanPepperoniPizza = americanPepperoniPizzaStore.orderPizza();
        System.out.println();

        // Create Mexican style pizza store and order pizzas
        PizzaIngredientFactory mexicanPizzaIngredientFactory = new MexicanPizzaIngredientFactory();

        PizzaFactory mexicanCheesePizzaFactory = new MexicanCheesePizzaFactory(mexicanPizzaIngredientFactory);
        PizzaFactory mexicanPepperoniPizzaFactory = new MexicanPepperoniPizzaFactory(mexicanPizzaIngredientFactory);

        PizzaStore mexicanCheesePizzaStore = new PizzaStore(mexicanCheesePizzaFactory);
        PizzaStore mexicanPepperoniPizzaStore = new PizzaStore(mexicanPepperoniPizzaFactory);
        System.out.println("Order for Mexican Cheese Pizza");

        Pizza mexicanCheesePizza = mexicanCheesePizzaStore.orderPizza();
        System.out.println();

        System.out.println("Order for Mexican Pepperoni Pizza");

        Pizza mexicanVeggiePizza = mexicanPepperoniPizzaStore.orderPizza();

    }
    }
