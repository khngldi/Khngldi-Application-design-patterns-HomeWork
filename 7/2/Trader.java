public class Trader implements Observer {
    private String name;
    public Trader(String name) {
        this.name = name;
    }
    @Override
    public void update(String valuta, double rating) {
        System.out.println("Уведомления для " + name + valuta + " изменился на " + rating);
    }
}
