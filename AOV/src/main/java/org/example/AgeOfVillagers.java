package org.example;

import java.util.List;

public class AgeOfVillagers {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,15);

        HouseBuilder RectangleHouse = new HouseBuilder();
        RectangleHouse.addComponents(rectangle);

        HouseBuilder SquareHouse = new HouseBuilder();
        SquareHouse.addComponents(new Square(10));

        HouseBuilder TriangularHouse = new HouseBuilder();
        TriangularHouse.addComponents(new Triangle(15));



        TreeBuilder mangoTreeComponents = new TreeBuilder();
        mangoTreeComponents.addComponents(new Rectangle(5, 10));

        TreeBuilder orangeTreeComponents = new TreeBuilder();
        orangeTreeComponents.addComponents(new Square(15));

        TreeBuilder bananaTreeComponents = new TreeBuilder();
        bananaTreeComponents.addComponents(new Triangle(10));


        WaterSourceBuilder swimmingPoolComponents = new WaterSourceBuilder();
        swimmingPoolComponents.addComponents(new Rectangle(20, 30));

        WaterSourceBuilder pond = new WaterSourceBuilder();
        pond.addComponents(new Square(20));


        WaterSourceBuilder lake = new WaterSourceBuilder();
        lake.addComponents(new Triangle(20));

        // Create villages using the Composite Pattern with multiple components
        CompositeComponent village1 = new CompositeComponent();
        village1.addComponent(RectangleHouse.build());
        village1.addComponent(mangoTreeComponents.build());
        village1.addComponent(swimmingPoolComponents.build());


        CompositeComponent village2 = new CompositeComponent();
        village2.addComponent(SquareHouse.build());
        village2.addComponent(orangeTreeComponents.build());
        village2.addComponent(pond.build());


        CompositeComponent village3 = new CompositeComponent();
        village3.addComponent(TriangularHouse.build());
        village3.addComponent(bananaTreeComponents.build());
        village3.addComponent(lake.build());


        System.out.println("Village 1:");
        village1.display();
        System.out.println();

        System.out.println("Village 2:");
        village2.display();
        System.out.println();

        System.out.println("Village 3:");
        village3.display();
    }
}
