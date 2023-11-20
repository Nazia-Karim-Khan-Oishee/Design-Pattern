package org.example;

public class ShoppingCartVisitor implements Visitor {

    @Override
    public int visit(Book book) {

        int cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println("Total price for " + fruit.getWeight()
                + "kg of " + fruit.getName() + " = "+cost);
        return cost;
    }

    @Override
    public int visit(ItemsinCart cart) {

        System.out.print("Total Cost = ");

        return cart.gettotalCost();
    }


}