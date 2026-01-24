package repository;

import model.Book;
import utils.DatabaseConnection;
import exception.DuplicateResourceException;
import java.util.List;

public class BookRepository {
    public void addBook(Book book) throws DuplicateResourceException {
        if (DatabaseConnection.findBookByTitle(book.getTitle()) != null) {
            throw new DuplicateResourceException("Книга с таким названием уже существует!");
        }
        DatabaseConnection.addBook(book);
    }

    public List<Book> getAllBooks() {
        return DatabaseConnection.getAllBooks();
    }
}

