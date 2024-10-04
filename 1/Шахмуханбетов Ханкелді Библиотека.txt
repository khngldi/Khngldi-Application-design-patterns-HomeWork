import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;
    public Library(){
        this.books=new ArrayList<>();
        this.readers=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public void register(Reader reader){
        readers.add(reader);
    }
    public void removeReader(Reader reader){
        readers.remove(reader);
    }
    public void Vydacha(String ISBN) {
        for (Book book : books) {
            if(book.getISBN().equals(ISBN)){
                if(book.getEkzempliar() > 0){
                    book.removeEkzempliar(1);
                    return;
                }
            }
        }
    }
    public void Vozvrat(String ISBN) {
        for (Book book : books) {
            if(book.getISBN().equals(ISBN)){
                if(book.getEkzempliar() > 0){
                    book.addEkzempliar(1);
                    return;
                }
            }
        }
    }
}
//Shakhmukhanbetov Khangeldi