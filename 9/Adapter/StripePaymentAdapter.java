public class StripePaymentAdapter implements IPaymentProcessor {
    private StripePaymentService stripePaymentService;

    public StripePaymentAdapter(StripePaymentService stripePaymentService) {
        this.stripePaymentService = stripePaymentService;
    }

    @Override
    public void processPayment(double amount) {
        stripePaymentService.makeTransaction(amount);
    }
}
