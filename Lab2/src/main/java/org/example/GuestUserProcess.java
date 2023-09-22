package org.example;

public class GuestUserProcess extends ShoppingProcess {
    @Override
    protected void browseProducts() {
        System.out.println("Guest user is browsing products.");
    }

    @Override
    protected void addToCart() {
        System.out.println("Guest user added items to the cart.");
    }

    @Override
    protected void checkout() {
        System.out.println("Asking the guest user to login or sign up to check out.");
    }


}
