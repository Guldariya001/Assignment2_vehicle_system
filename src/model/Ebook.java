package model;

public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, Author author, double price, double fileSizeMB) {
        super(title, author, price);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() { return fileSizeMB; }
}
