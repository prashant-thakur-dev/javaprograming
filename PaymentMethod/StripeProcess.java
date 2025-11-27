package src.PaymentMethod;

public class StripeProcess implements PaymentProcess{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing stripe payment of " + amount);
    }
}
