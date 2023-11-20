package org.example;


public class Main {
    public static void main(String[] args) {


        Book Book1 = new Book(20, "1234");
        Book Book2 = new Book(100, "5678");


        Fruit Banana = new Fruit(10, 2, "Banana");
        Fruit Apple = new Fruit(5, 5, "Apple");

        ItemElement[] items ={Book1,Book2,Banana,Apple};


        ItemsinCart cart = new ItemsinCart(items);

        int total = cart.accept(new ShoppingCartVisitor());
        System.out.println(total);
    }


    }
