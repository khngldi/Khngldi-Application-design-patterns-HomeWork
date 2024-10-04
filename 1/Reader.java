public class Reader {
    private String Name;
    private String ID;

    public Reader(String Name, String ID){
        this.ID=ID;
        this.Name=Name;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }
}
