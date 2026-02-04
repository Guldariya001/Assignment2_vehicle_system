package service;

import model.Book;
import repository.interfaces.CrudRepository;
import service.interfaces.LibraryService;
import exception.*;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    private final CrudRepository<Book> bookRepository;

    public LibraryServiceImpl(CrudRepository<Book> bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        if (book == null)
            throw new InvalidInputException("Book cannot be null");

        if (book.getTitle() == null || book.getTitle().isBlank())
            throw new InvalidInputException("Book title is required");

        if (bookRepository.findById(book.getId()) != null)
            throw new DuplicateResourceException("Book already exists");

        bookRepository.save(book);
    }

    @Override
    public Book getBookById(int id) {
        Book book = bookRepository.findById(id);
        if (book == null)
            throw new ResourceNotFoundException("Book not found");
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(int id) {
        if (bookRepository.findById(id) == null)
            throw new ResourceNotFoundException("Book not found");
        bookRepository.delete(id);
    }
}


