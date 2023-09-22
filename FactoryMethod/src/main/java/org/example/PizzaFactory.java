package org.example;//package org.example;


abstract class PizzaFactory {
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have that pizza.");
        }

        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);
}