package behavior.visitor.problem;

public class ExpressionPrinter {
    public static void print(Expression expression, StringBuilder sb) {
        if (expression instanceof DoubleExpression) { // e.getClass() == DoubleExpression.class
            DoubleExpression de = (DoubleExpression) expression;
            sb.append(de.getValue());
        } else if (expression instanceof AdditionalExpression) {
            AdditionalExpression ae = (AdditionalExpression) expression;
            sb.append("(");
            print(ae.getLeft(), sb);
            sb.append(" + ");
            print(ae.getRight(), sb);
            sb.append(")");
        }
    }
}
