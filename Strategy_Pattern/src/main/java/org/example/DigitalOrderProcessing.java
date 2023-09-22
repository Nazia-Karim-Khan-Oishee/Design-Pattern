package org.example;

// Concrete strategy for digital products
class DigitalOrderProcessing implements OrderProcessingStrategy {
    @Override
    public String processOrder(String product) {
        return("Processing order for digital product: " + product);
    }

    @Override
    public String fulfillOrder(String product) {
        return("Fulfilling order for digital product: " + product);
    }
}
