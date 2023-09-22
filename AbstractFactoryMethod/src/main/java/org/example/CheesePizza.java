package org.example;

class CheesePizza implements Pizza {
    private Dough dough;
    private Sauce sauce;

    public CheesePizza(Dough dough, Sauce sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing a cheese pizza with " + dough.getDescription() + " and " + sauce.getDescription());
    }

    @Override
    public void bake() {
        System.out.println("Baking the cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing the cheese pizza");
    }
}