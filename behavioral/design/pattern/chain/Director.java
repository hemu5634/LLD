package behavioral.design.pattern.chain;

public class Director extends Approver{
    @Override
    void processLeave(int leaves) {
        if(leaves<=14){
            System.out.println("Director Approved the Leave");
        }else {
            System.out.println("Leave Denied");
        }
    }
}
