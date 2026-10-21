package in.codewithsp.strategy;

public class WalletPayment implements PaymentStrategy{

    private String walletId;

    public WalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay() {
        System.out.println("Payment Successful through wallet ID: "+ walletId);
    }
}
