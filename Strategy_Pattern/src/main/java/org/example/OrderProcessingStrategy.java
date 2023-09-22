package org.example;

interface OrderProcessingStrategy {
    String processOrder(String product);
    String fulfillOrder(String product);
}