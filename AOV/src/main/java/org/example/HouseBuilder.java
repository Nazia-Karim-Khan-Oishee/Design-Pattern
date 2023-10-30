package org.example;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder implements Builder{
    private List<Shape> components = new ArrayList<>();

    @Override
    public void addComponents(Shape shape) {
        components.add(shape);

    }
    @Override
    public VillageComponent build() {
        return new House(components);
    }
}
