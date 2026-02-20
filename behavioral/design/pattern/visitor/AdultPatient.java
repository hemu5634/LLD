package behavioral.design.pattern.visitor;

public class AdultPatient implements Patient{
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
