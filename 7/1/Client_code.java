public class Client_code {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardPayment("57658125155"));
        paymentContext.pay(1000);
        paymentContext.setPaymentStrategy(new PayPalPayment("khanekshakh@gmail.com"));
        paymentContext.pay(500);
        paymentContext.setPaymentStrategy(new CryptoPayment("sd5f5s5f8"));
        paymentContext.pay(300);
    }
}
