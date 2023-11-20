package org.example;

public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int weight, String name) {
        this.pricePerKg = priceKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return this.pricePerKg;
    }


    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}