public class PaymentSystemTest {
    public static void main(String[] args) {
        IPaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        paypalProcessor.processPayment(100.0);

        StripePaymentService stripeService = new StripePaymentService();
        IPaymentProcessor stripeProcessor = new StripePaymentAdapter(stripeService);
        stripeProcessor.processPayment(200.0);

        SquarePaymentService squareService = new SquarePaymentService();
        IPaymentProcessor squareProcessor = new SquarePaymentAdapter(squareService);
        squareProcessor.processPayment(150.0);
    }
}
