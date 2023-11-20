package org.example;

public interface Visitor {

    int visit(Book book);
    int visit(Fruit fruit);

    int visit(ItemsinCart cart);

}