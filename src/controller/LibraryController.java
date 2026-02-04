package controller;

import model.Book;
import service.interfaces.LibraryService;

public class LibraryController {

    private final LibraryService service;

    public LibraryController(LibraryService service) {
        this.service = service;
    }

    public void createBook(Book book) {
        service.addBook(book);
    }
}
