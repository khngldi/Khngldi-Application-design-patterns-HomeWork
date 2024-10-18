public class PayPalPayment implements IPaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double money) {
        System.out.println(money + ": оплата через пэйпал" + email);
    }
}
