package behavioral.design.pattern.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("processing a payment in UPI");
    }
}
