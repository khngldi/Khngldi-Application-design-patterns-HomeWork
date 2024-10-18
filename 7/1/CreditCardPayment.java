public class CreditCardPayment implements IPaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double money) {
        System.out.println(money + ": оплата через кредит карта" + cardNumber);
    }
}
