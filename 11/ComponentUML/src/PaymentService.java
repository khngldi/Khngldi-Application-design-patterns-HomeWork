public interface PaymentService {
    boolean processPayment(String user, double amount, String paymentMethod);
    boolean checkPaymentStatus(String transactionId);
}