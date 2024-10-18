public class TradingRobot implements Observer {
    @Override
    public void update(String valuta, double rating) {
        if (rating > 1.2) {
            System.out.println("Робот покупает " + valuta + " по " + rating);
        } else {
            System.out.println("Робот продает " + valuta + " по " + rating);
        }
    }
}
