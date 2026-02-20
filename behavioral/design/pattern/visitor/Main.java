package behavioral.design.pattern.visitor;

public class Main {
    public static void main(String[] args) {
        Patient[] patients = {new AdultPatient(),new ChildPatient(),new SeniorPateint()};
        DiagnosisVisitor diagnosisVisitor = new DiagnosisVisitor();
        BillVisitor billVisitor = new BillVisitor();
        for(Patient patient : patients){
            patient.accept(diagnosisVisitor);
            patient.accept(billVisitor);
        }
    }
}
