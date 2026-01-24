import controller.BookController;
import model.Author;
import model.EBook;
import model.PrintedBook;
import model.Book;
import exception.DuplicateResourceException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookController controller = new BookController();

        try {
            controller.addBook(new PrintedBook("1984", new Author("George Orwell"), 15.0, 328));
            controller.addBook(new EBook("Harry Potter", new Author("J.K. Rowling"), 10.0, 5.0));
        } catch (DuplicateResourceException e) {
            System.out.println(e.getMessage());
        }

        List<Book> books = controller.getAllBooks();
        for (Book b : books) {
            System.out.println(b.getTitle() + " by " + b.getAuthor().getName() + ", $" + b.getPrice());
        }
    }
}



