package behavioral.design.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        CashPayment cash = new CashPayment();
        CrediCardPayment credit = new CrediCardPayment();
        UpiPayment upi = new UpiPayment();
        DebitCardPayment debit = new DebitCardPayment();

        PaymentProcessor processor = new PaymentProcessor(cash);
        processor.processPayment();

        processor.setStrategy(credit);
        processor.processPayment();

        processor.setStrategy(debit);
        processor.processPayment();

        processor.setStrategy(upi);
        processor.processPayment();
    }
}
