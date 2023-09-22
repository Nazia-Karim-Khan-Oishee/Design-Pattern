package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        OrderProcessingContext processingContext = new OrderProcessingContext();

        System.out.println("Physical Product Order:");

        // Physical Product Order
        processingContext.setProcessingStrategy(new PhysicalOrderProcessing());
        processingContext.processAndFulfillOrder("T-Shirt");

        System.out.println();
        System.out.println();

        System.out.println("Digital Product Order:");
        // Digital Product Order
        processingContext.setProcessingStrategy(new DigitalOrderProcessing());
        processingContext.processAndFulfillOrder("E-book");
    }
}