package behavior.visitor.solution;

import behavior.visitor.solution.visitor.ExpressionVisitor;

public class AdditionalExpression extends Expression {

    private Expression left, right;

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }


    public AdditionalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
