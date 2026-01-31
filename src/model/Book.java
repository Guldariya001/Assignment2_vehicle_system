package model;

public class Book implements PricedItem, Validatable {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public boolean validate() {
        return title != null && !title.isEmpty() && price >= 0;
    }

    @Override
    public double getPriceValue() {
        return price;
    }
}