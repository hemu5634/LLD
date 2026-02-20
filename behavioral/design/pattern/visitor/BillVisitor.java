package behavioral.design.pattern.visitor;

public class BillVisitor implements Vistor{
    @Override
    public void visit(Patient patient) {
        if(patient instanceof ChildPatient)
            System.out.println("Bill of a child Patient");
        else if (patient instanceof AdultPatient) {
            System.out.println("Bill of a adult patient");
        } else if (patient instanceof SeniorPateint) {
            System.out.println("Bill of a senior patient");
        }else
            System.out.println("Bill of a default Patient");
    }
}
