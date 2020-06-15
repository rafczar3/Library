package com.company.io;

import com.company.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);

    public void close(){
        scanner.close();
    }

    public Book readAndCreateBook(){
        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("Author:");
        String author = scanner.nextLine();
        System.out.println("Publisher:");
        String publisher = scanner.nextLine();
        System.out.println("ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Release Date:");
        int releaseDate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Page:");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}
