package behavioral.design.pattern.visitor;

public class ChildPatient implements Patient{
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
