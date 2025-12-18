package src.practic.PaymentMethod;

public class PayPalProcess implements PaymentProcess{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
