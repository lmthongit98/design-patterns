package behavior.visitor.solution.visitor;

import behavior.visitor.solution.AdditionalExpression;
import behavior.visitor.solution.DoubleExpression;

public interface ExpressionVisitor {
    void visit(DoubleExpression expression);
    void visit(AdditionalExpression expression);
}
