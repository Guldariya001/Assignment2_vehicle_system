package utils;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    private static final List<Book> books = new ArrayList<>();

    public static void addBook(Book book) { books.add(book); }
    public static List<Book> getAllBooks() { return books; }
    public static Book findBookByTitle(String title) {
        return books.stream().filter(b -> b.getTitle().equals(title)).findFirst().orElse(null);
    }
}

