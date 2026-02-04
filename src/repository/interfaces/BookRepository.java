package repository;

import model.Book;
import repository.interfaces.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements CrudRepository<Book> {

    private final List<Book> books = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public Book findById(int id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public void delete(int id) {
        books.removeIf(b -> b.getId() == id);
    }
}

