public class PaymentServiceImpl implements PaymentService {
    @Override
    public boolean processPayment(String user, double amount, String paymentMethod) {
        return true;
    }

    @Override
    public boolean checkPaymentStatus(String transactionId) {
        return true;
    }
}