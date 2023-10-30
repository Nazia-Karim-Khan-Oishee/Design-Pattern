package org.example;

import java.util.List;

class Tree implements VillageComponent {
    private List<Shape> components;

    public Tree(List<Shape> components) {
        this.components = components;
    }

    public void display() {
        System.out.println("Tree with :");
        for (Shape component : components) {
            component.draw();
        }
    }
}