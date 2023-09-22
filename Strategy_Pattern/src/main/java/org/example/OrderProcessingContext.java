package org.example;

// Context class that uses the order processing strategy
class OrderProcessingContext {
    private OrderProcessingStrategy processingStrategy;

    public void setProcessingStrategy(OrderProcessingStrategy strategy) {
        this.processingStrategy = strategy;
    }

    public void processAndFulfillOrder(String product) {
        System.out.print(processingStrategy.processOrder(product));
        System.out.println();
        System.out.print(processingStrategy.fulfillOrder(product));
    }
}
