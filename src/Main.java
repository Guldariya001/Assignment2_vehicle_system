import controller.LibraryController;
import model.*;
import repository.BookRepository;
import service.LibraryServiceImpl;
import utils.ReflectionUtils;
import utils.SortingUtils;

public class Main {
    public static void main(String[] args) {

        BookRepository repo = new BookRepository();
        LibraryServiceImpl service = new LibraryServiceImpl(repo);
        LibraryController controller = new LibraryController(service);

        Category c1 = new Category(1, "Programming");

        Book b1 = new Book(1, "Java", "Bloch", true, c1, 50);
        Book b2 = new Book(2, "Algorithms", "CLRS", true, c1, 70);

        controller.createBook(b1);
        controller.createBook(b2);

        SortingUtils.sortByTitle(service.getAllBooks());
        ReflectionUtils.inspect(b1);
    }
}




