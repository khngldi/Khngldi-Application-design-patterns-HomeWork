public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBookToLibrary(Library library, Book book) {
        library.addBook(book);
        System.out.println(name + " added the book: " + book.getTitle() + " to the library.");
    }

    public void removeBookFromLibrary(Library library, Book book) {
        library.removeBook(book);
        System.out.println(name + " removed the book: " + book.getTitle() + " from the library.");
    }
}
