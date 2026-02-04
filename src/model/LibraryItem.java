package model;

public abstract class LibraryItem {
    private int id;
    private String title;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public abstract String getType();
    public abstract boolean isAvailable();

    public String displayInfo() {
        return id + ": " + title;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
}
