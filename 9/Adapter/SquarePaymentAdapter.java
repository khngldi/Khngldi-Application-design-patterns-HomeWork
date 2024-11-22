public class SquarePaymentAdapter implements IPaymentProcessor {
    private SquarePaymentService squarePaymentService;

    public SquarePaymentAdapter(SquarePaymentService squarePaymentService) {
        this.squarePaymentService = squarePaymentService;
    }

    @Override
    public void processPayment(double amount) {
        squarePaymentService.completePayment(amount);
    }
}
