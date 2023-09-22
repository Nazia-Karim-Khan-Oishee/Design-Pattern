package org.example;

public abstract class ShoppingProcess {
    public final void Shopping() {
        browseProducts();
        addToCart();
        checkout();
    }

    protected abstract void browseProducts();
    protected abstract void addToCart();
    protected abstract void checkout();
}
