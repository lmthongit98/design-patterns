package behavior.visitor.solution.visitor.impl;

import behavior.visitor.solution.AdditionalExpression;
import behavior.visitor.solution.DoubleExpression;
import behavior.visitor.solution.visitor.ExpressionVisitor;

public class ExpressionPrinterVisitor implements ExpressionVisitor {

    private final StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression expression) {
        sb.append(expression.getValue());
    }

    @Override
    public void visit(AdditionalExpression expression) {
        sb.append("(");
        expression.getLeft().accept(this);
        sb.append(" + ");
        expression.getRight().accept(this);
        sb.append(")");
    }

    public String getCompleteExpression() {
        return sb.toString();
    }
}
