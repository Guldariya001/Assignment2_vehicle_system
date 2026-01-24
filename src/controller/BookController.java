package controller;

import model.Book;
import service.BookService;
import exception.DuplicateResourceException;
import java.util.List;

public class BookController {
    private final BookService service = new BookService();

    public void addBook(Book book) throws DuplicateResourceException {
        service.addBook(book);
    }

    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }
}

