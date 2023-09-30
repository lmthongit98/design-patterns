package behavior.visitor.solution;

import behavior.visitor.solution.visitor.ExpressionVisitor;

public class DoubleExpression extends Expression {

    private double value;

    public double getValue() {
        return value;
    }

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
