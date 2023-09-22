package org.example;

class CheesePizzaFactory extends PizzaFactory {
    @Override
    protected Pizza createPizza(String pizzaType) {
        if ("cheese".equalsIgnoreCase(pizzaType)) {
            return new CheesePizza();
        }
        return null;
    }
}