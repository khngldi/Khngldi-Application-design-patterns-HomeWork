import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : bookList) {
            if (!book.isRented()) {
                System.out.println(book);
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("All books in the library:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public Book searchBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
