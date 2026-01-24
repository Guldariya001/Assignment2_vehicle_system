package model;

public class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, Author author, double price, int pages) {
        super(title, author, price);
        this.pages = pages;
    }

    public int getPages() { return pages; }
}
