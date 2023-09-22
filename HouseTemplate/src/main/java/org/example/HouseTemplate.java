package org.example;

public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    protected void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    protected abstract void buildWalls();
    protected abstract void buildPillars();

    protected void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}