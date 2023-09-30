package behavior.visitor.problem;

public class DoubleExpression extends Expression {
    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
//    @Override
//    public void print(StringBuilder sb) {
//        sb.append(value);
//    }
}
