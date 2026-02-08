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
