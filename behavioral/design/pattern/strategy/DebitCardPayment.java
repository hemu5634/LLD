package behavioral.design.pattern.strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing a payment through Debit Card");
    }
}
