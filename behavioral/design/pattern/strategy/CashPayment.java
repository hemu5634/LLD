package behavioral.design.pattern.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing payment in Cash");
    }
}
