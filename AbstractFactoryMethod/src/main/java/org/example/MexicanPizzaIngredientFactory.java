package org.example;

class MexicanPizzaIngredientFactory extends PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new StuffedCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BBQSauce();
    }
}