package org.example;

class AmericanPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}