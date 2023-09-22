package org.example;

class MexicanCheesePizzaFactory extends PizzaFactory {

    private PizzaIngredientFactory ingredientFactory;

    public MexicanCheesePizzaFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza createPizza() {
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        return new CheesePizza(dough, sauce);
    }
}