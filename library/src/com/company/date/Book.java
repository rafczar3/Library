package com.company.date;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        setTitle(title);
        setAuthor(author);
        setReleaseDate(releaseDate);
        setPages(pages);
        setPublisher(publisher);
    }

    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this(title, author, releaseDate, pages, publisher);
        setIsbn(isbn);
    }

    public void printBook() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher ;
        if (isbn != null) {
            info = info + "; " + isbn;
        }
        System.out.println(info);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages >= 0)
            this.pages = pages;
        else
            System.out.println("Invalid value");
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn.length() == 13)
            this.isbn = isbn;
        else
            System.out.println("Invalid value");
    }
}
