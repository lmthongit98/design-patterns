package behavior.visitor.solution.visitor.impl;

import behavior.visitor.solution.AdditionalExpression;
import behavior.visitor.solution.DoubleExpression;
import behavior.visitor.solution.visitor.ExpressionVisitor;

public class ExpressionCalculatorVisitor implements ExpressionVisitor {

    private double result;

    @Override
    public void visit(DoubleExpression expression) {
        result = expression.getValue();
    }

    @Override
    public void visit(AdditionalExpression expression) {
        expression.getLeft().accept(this);
        double a = result;
        expression.getRight().accept(this);
        double b = result;
        result = a + b;
    }

    public double getResult() {
        return result;
    }

}
