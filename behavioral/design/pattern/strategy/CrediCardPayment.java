package behavioral.design.pattern.strategy;

public class CrediCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("processing payment with credit card");
    }
}
