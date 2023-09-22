package org.example;


class MeatPizzaFactory extends PizzaFactory {
    @Override
    protected Pizza createPizza(String pizzaType) {
        if ("meat".equalsIgnoreCase(pizzaType)) {
            return new MeatPizza();
        }
        return null;
    }
}