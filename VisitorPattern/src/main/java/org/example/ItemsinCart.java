package org.example;

public class ItemsinCart implements ItemElement {
    private int totalCost=0 ;

    ItemElement[] itemElements;

    public  ItemsinCart(ItemElement[] itemElements) {
        this.itemElements = itemElements;
    }


    @Override
    public int accept(Visitor visitor) {

        for (int i = 0; i < itemElements.length; i++) {
            this.totalCost += itemElements[i].accept(visitor);

        }
        return visitor.visit(this);
    }

    public int gettotalCost() {

        return  totalCost;

    }
}

