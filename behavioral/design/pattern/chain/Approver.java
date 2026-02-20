package behavioral.design.pattern.chain;

abstract class Approver {
    protected Approver nextApprover;
    public void setNextApprover(Approver approver){
        this.nextApprover=approver;
    }
    abstract void processLeave(int leaves);
}
