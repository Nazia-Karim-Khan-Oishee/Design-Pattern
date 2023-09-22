package org.example;

public class Main {
    public static void main(String[] args) {


       // LibraryCatalog newcatalog = new LibraryCatalog();
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        catalog.searchForBook("Head First Design Patterns");
        catalog.checkoutBook("Head First Design Patterns","Nazia");
        catalog.returnBook("Head First Design Patterns"," Nazia");


//        System.out.println();
//
//        LibraryCatalog catalog2 = LibraryCatalog.getInstance();
//
//        if (catalog.equals(catalog2))
//        {
//            System.out.println("catalog and catalog2 are equal.");
//        }
//        else
//        {
//            System.out.println("catalog and catalog2 are not equal.");
//        }
        }
    }
