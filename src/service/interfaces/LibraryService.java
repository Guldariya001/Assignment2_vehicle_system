package service.interfaces;

import model.Book;
import java.util.List;

public interface LibraryService {

    void addBook(Book book);

    Book getBookById(int id);

    List<Book> getAllBooks();

    void deleteBook(int id);
}

