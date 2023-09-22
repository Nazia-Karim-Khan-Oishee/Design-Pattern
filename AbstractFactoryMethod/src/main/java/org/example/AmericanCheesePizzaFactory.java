package org.example;

class AmericanCheesePizzaFactory extends PizzaFactory {
    private PizzaIngredientFactory ingredientFactory;

    public AmericanCheesePizzaFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza createPizza() {
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        return new CheesePizza(dough, sauce);
    }
}