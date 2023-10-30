package org.example;

import java.util.List;

public class House implements VillageComponent {
    private List<Shape> components;

    public House(List<Shape> components) {
        this.components = components;
    }

    @Override
    public void display() {
        System.out.println("House built with :");
        for (Shape component : components) {
            component.draw();
        }
    }
}