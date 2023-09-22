package org.example;

public class MeatPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing a meat pizza");

    }

    @Override
    public void bake() {
        System.out.println("Baking a meat pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting a meat pizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing a meat pizza");

    }
}
