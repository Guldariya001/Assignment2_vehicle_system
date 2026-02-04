package model;

public class Book extends LibraryItem {
    private String author;
    private boolean available;
    private Category category;
    private double price;

    public Book(int id, String title, String author, boolean available, Category category, double price) {
        super(id, title);
        this.author = author;
        this.available = available;
        this.category = category;
        this.price = price;
    }

    @Override
    public String getType() {
        return "BOOK";
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
