package org.example;

class MexicanPepperoniPizzaFactory extends PizzaFactory {

    private PizzaIngredientFactory ingredientFactory;

    public MexicanPepperoniPizzaFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza createPizza() {
        Dough dough =ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        return new PepperoniPizza(dough, sauce);
    }
}