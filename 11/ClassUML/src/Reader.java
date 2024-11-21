import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> rentedBooks;
    private static final int MAX_RENTAL_BOOKS = 3; // Максимальное количество книг для аренды

    public Reader(String name) {
        this.name = name;
        this.rentedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void rentBook(Book book) {
        if (rentedBooks.size() < MAX_RENTAL_BOOKS && !book.isRented()) {
            rentedBooks.add(book);
            book.rent();
            System.out.println(name + " rented the book: " + book.getTitle());
        } else {
            System.out.println(name + " cannot rent this book. Either the book is already rented or maximum rental limit reached.");
        }
    }

    public void returnBook(Book book) {
        if (rentedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " did not rent this book.");
        }
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }
}
