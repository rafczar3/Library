package com.company.logic;

import com.company.date.Book;

public class Library {

    public static void main(String[] args) {
        final String appName = "Library v0.1";


        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion", "9788324620845");
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media");



        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printBook();
        book2.printBook();
        book3.printBook();


    }
}
