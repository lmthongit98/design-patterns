package behavior.visitor.problem;

public class Demo {

    public static void main(String[] args) {
        // 1 + (2 + 3)
        AdditionalExpression expression = new AdditionalExpression(
                new DoubleExpression(1),
                new AdditionalExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                )
        );
        StringBuilder sb = new StringBuilder();
//        expression.print(sb);
        ExpressionPrinter.print(expression, sb);
        System.out.println(sb);

    }

}
