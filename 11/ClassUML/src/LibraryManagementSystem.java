public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("Alice");

        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        librarian.addBookToLibrary(library, book1);
        librarian.addBookToLibrary(library, book2);
        librarian.addBookToLibrary(library, book3);

        Reader reader = new Reader("John");

        library.displayAvailableBooks();

        reader.rentBook(book1);
        reader.rentBook(book2);

        reader.rentBook(book3);

        library.displayAllBooks();

        reader.returnBook(book1);

        library.displayAvailableBooks();
    }
}
