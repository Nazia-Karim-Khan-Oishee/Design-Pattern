package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {

                System.out.println("Guest User's ShoppingProcess:");
                ShoppingProcess guestProcess = new GuestUserProcess();
                guestProcess.Shopping();
                System.out.println( );
                System.out.println("Registered User's ShoppingProcess:");
                ShoppingProcess registeredProcess = new RegisteredUserProcess();
                registeredProcess.Shopping();

    }

    }
