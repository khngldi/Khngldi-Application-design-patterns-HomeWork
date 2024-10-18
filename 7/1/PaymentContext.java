public class PaymentContext {
    private IPaymentStrategy paymentStrategy;
    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double money) {
        if (paymentStrategy == null) {
            System.out.println("Стратегия оплаты не выбрана!");
        } else {
            paymentStrategy.pay(money);
        }
    }
}
