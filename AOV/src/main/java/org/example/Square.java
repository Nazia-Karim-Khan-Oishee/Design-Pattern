package org.example;

public class Square implements  Shape{

    private int length;
    public Square(int length)
    {
        this.length = length;
    }
    @Override
    public void draw() {
        System.out.println("A Square of length " + length);
    }
}
