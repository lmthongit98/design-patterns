package behavior.visitor.solution;

import behavior.visitor.solution.visitor.ExpressionVisitor;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
