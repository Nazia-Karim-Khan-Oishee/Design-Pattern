package org.example;

class PepperoniPizzaFactory extends PizzaFactory {
    @Override
    protected Pizza createPizza(String pizzaType) {
        if ("pepperoni".equalsIgnoreCase(pizzaType)) {
            return new PepperoniPizza();
        }
        return null;
    }
}