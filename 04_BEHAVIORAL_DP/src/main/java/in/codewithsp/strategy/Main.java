package in.codewithsp.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PaymentStrategy card = new CardPayment("123456789012");
        cart.setPaymentStrategy(card);
        cart.checkout();
        cart.setPaymentStrategy(new UPIPayment("test@okupi"));
        cart.checkout();
        cart.setPaymentStrategy(new WalletPayment("wallet123"));
        cart.checkout();
    }
}
