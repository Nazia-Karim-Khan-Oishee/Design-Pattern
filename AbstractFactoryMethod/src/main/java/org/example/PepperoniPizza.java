package org.example;

class PepperoniPizza implements Pizza {
    private Dough dough;
    private Sauce sauce;

    public PepperoniPizza(Dough dough, Sauce sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing a pepperoni pizza with " + dough.getDescription() + " and " + sauce.getDescription());
    }

    @Override
    public void bake() {
        System.out.println("Baking the pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing the pepperoni pizza");
    }
}