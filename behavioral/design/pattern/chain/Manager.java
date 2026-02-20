package behavioral.design.pattern.chain;

public class Manager extends Approver{

    @Override
    void processLeave(int leaves) {
        if(leaves<=10){
            System.out.println("Manager Approved the leave");
        }else if(nextApprover!=null){
            nextApprover.processLeave(leaves);
        }
    }
}
