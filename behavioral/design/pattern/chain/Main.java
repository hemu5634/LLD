package behavioral.design.pattern.chain;

public class Main {
    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
        supervisor.processLeave(10);
        supervisor.processLeave(14);
        supervisor.processLeave(20);
    }
}
