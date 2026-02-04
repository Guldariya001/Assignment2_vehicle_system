package utils;

import model.Book;
import java.util.List;

public class SortingUtils {

    public static void sortByTitle(List<Book> books) {
        books.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
    }

    public static void sortByPrice(List<Book> books) {
        books.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
    }
}

