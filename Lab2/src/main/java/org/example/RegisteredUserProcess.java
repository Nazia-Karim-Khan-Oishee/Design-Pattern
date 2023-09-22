package org.example;

public class RegisteredUserProcess extends ShoppingProcess {
    @Override
    protected void browseProducts() {
        System.out.println("Registered User is browsing products.");
    }

    @Override
    protected void addToCart() {
        System.out.println("Registered User added items to the cart.");
    }

    @Override
    protected void checkout() {
        System.out.println("Registered User is proceeding to checkout.");
        applyDiscount();
        addRewards();
        completePayment();
    }

    private void applyDiscount() {
        System.out.println("Discount applied for Registered User.");
    }

    private void addRewards() {
        System.out.println("Rewards added for Registered User.");
    }

    private void completePayment() {
        System.out.println("Payment completed for Registered User.");
    }
}
