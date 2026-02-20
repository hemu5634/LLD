package behavioral.design.pattern.visitor;

public class SeniorPateint implements Patient{
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
