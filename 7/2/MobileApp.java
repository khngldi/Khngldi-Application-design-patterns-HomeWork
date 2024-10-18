public class MobileApp implements Observer {
    @Override
    public void update(String valuta, double rating) {
        System.out.println("Мобильное приложение: курс " + valuta + " изменился до " + rating);
    }
}
