package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Person aperson = new Person("a","b","c","d");
        System.out.printf(aperson.toString());
        System.out.print("\n");
        MyDate date= new MyDate(1,8,2023);
        Faculty afaculty = new Faculty("f","b","c","d","e",10000, date, 2.5, "lecturer");
        System.out.printf(afaculty.toString());

        }
    }
