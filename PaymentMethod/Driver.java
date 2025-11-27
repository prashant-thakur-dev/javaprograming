package src.PaymentMethod;

public class Driver {
    public static void main(String[] args) {
        PaymentFactory.getProcess("paypal").processPayment(123.2);
    }
}
