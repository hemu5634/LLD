package behavioral.design.pattern.chain;

public class Supervisor extends Approver {
    @Override
    void processLeave(int leaves) {
        if(leaves<=3){
            System.out.println("Supervisor processing leaves");
        }else if(nextApprover!=null) {
            nextApprover.processLeave(leaves);
        }
    }
}
