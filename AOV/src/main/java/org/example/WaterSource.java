package org.example;

import java.util.List;

public class WaterSource implements VillageComponent {
    private List<Shape> components;

    public WaterSource(List<Shape> components) {
        this.components = components;
    }

    public void display() {
        System.out.println("Water source with :");
        for (Shape component : components) {
            component.draw();
        }
    }
}