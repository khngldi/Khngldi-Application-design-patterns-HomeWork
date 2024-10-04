public class TEST {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("CapCutEditGuide", "Khngldi", "6147", 7);
        Book book2 = new Book("BIOS Settings", "Nurgeldy Shakhmukhanbetov", "0282", 5);
        library.addBook(book1);
        library.addBook(book2);
        Reader reader1 = new Reader("Bauyrzhan", "R1");
        Reader reader2 = new Reader("Bagybek", "R2");
        library.register(reader1);
        library.register(reader2);
        library.Vydacha("6147");
        library.Vozvrat("6147");
    }
}
//Shakhnukhanbetov Khangeldi