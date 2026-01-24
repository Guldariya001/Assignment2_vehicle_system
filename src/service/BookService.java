package service;

import model.Book;
import repository.BookRepository;
import exception.DuplicateResourceException;
import java.util.List;

public class BookService {
    private final BookRepository repository = new BookRepository();

    public void addBook(Book book) throws DuplicateResourceException {
        repository.addBook(book);
    }

    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }
}

