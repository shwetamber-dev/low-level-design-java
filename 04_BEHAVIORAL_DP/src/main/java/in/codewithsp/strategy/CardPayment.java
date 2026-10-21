package in.codewithsp.strategy;

public class CardPayment implements PaymentStrategy{

    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Payment Successful through Card: "+ cardNumber.substring(cardNumber.length()-4));
    }
}
