package in.codewithsp.strategy;

public class UPIPayment implements PaymentStrategy{

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Payment Successful through UPI ID: "+ upiId);
    }
}
