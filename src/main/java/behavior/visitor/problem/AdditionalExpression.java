package behavior.visitor.problem;

public class AdditionalExpression extends Expression {
    private Expression left, right;

    public AdditionalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
//    @Override
//    public void print(StringBuilder sb) {
//        sb.append("(");
//        left.print(sb);
//        sb.append(" + ");
//        right.print(sb);
//        sb.append(")");
//    }
}
