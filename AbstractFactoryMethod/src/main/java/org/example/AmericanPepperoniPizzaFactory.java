package org.example;

class AmericanPepperoniPizzaFactory extends PizzaFactory {
    private PizzaIngredientFactory ingredientFactory;

    public AmericanPepperoniPizzaFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza createPizza() {
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        return new PepperoniPizza(dough, sauce);
    }
}