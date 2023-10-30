package org.example;

import java.util.ArrayList;
import java.util.List;

class CompositeComponent  {
    private List<VillageComponent> components = new ArrayList<>();

    public void addComponent(VillageComponent component) {
        components.add(component);
    }

    public void display() {
        for (VillageComponent component : components) {
            component.display();
        }
    }
}