package behavioral.design.pattern.visitor;

public class DiagnosisVisitor implements Vistor{
    @Override
    public void visit(Patient patient) {
        if(patient instanceof ChildPatient)
            System.out.println("Diagnosis of a child Patient");
        else if (patient instanceof AdultPatient) {
            System.out.println("Diagnosis of a adult patient");
        } else if (patient instanceof SeniorPateint) {
            System.out.println("Diagnosis of a senior patient");
        }else
            System.out.println("Diagnosis of a default Patient");
    }
}
