package org.example;

class PhysicalOrderProcessing implements OrderProcessingStrategy {
    @Override
    public String processOrder(String product) {
        return("Processing order for physical product: " + product);
    }

    @Override
    public String fulfillOrder(String product) {
       return("Fulfilling order for physical product: " + product);
    }
}