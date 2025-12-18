package src.practic.PaymentMethod;

public class PaymentFactory {
    public static PaymentProcess getProcess(String type){
        switch (type) {
            case "paypal": return new PayPalProcess();
            case "stripe": return new StripeProcess();
            default: throw new IllegalArgumentException("Unknown processor");
        }
    }

}
