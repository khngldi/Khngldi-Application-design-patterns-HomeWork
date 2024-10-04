public class Book {
    private String Name;
    private String Author;
    private String ISBN;
    private int ekzempliar;
    public Book(String Name, String Author, String ISBN, int ekzempliar){
        this.Name=Name;
        this.Author=Author;
        this.ISBN=ISBN;
        this.ekzempliar=ekzempliar;
    }
    public String getName() {
        return Name;
    }
    public String getAuthor() {
        return Author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getEkzempliar() {
        return ekzempliar;
    }
    public void setEkzempliar(int ekzempliar) {
        this.ekzempliar = ekzempliar;
    }

    public void addEkzempliar(int ekzempliar){
        this.ekzempliar+=ekzempliar;
    }
    public void removeEkzempliar(int ekzempliar){
        this.ekzempliar-=ekzempliar;
    }

}
//Shakhmukhanbetov Khangeldi