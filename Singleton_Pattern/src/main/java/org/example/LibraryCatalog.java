package org.example;

// In a library management system, using the Singleton Pattern
// we can ensure that there is only one instance of the library catalog system.
// This will prevent redundant data and will ensure consistent catalog information.
public class LibraryCatalog {
    private static LibraryCatalog instance = new LibraryCatalog();

    private LibraryCatalog() {

    }

    public static LibraryCatalog getInstance() {

        return instance;
    }

    public void searchForBook(String BookTitle) {
        System.out.println("Searching for book: " + BookTitle);
    }

    public void checkoutBook(String BookTitle, String borrower) {
        System.out.println( BookTitle + " book borrowed by " + borrower);

    }
        public void returnBook(String BookTitle, String reader) {
            System.out.println(BookTitle + " book returned by" + reader);
        }

}
