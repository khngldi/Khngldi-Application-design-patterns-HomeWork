public class CryptoPayment implements IPaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double money) {
        System.out.println(money + ": оплата через крипта" + walletAddress);
    }
}
