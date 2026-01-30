package service;

import java.util.List;
import model.Book;
import repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
