package org.example;

public class Triangle implements  Shape{

    private int height;
    public Triangle(int height)
    {
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("A Triangle of height " + height);
    }
}
