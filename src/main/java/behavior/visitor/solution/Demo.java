package behavior.visitor.solution;


import behavior.visitor.solution.visitor.impl.ExpressionCalculatorVisitor;
import behavior.visitor.solution.visitor.impl.ExpressionPrinterVisitor;

public class Demo {
    public static void main(String[] args) {
        // 1 + 2 + 3
        Expression expression = new AdditionalExpression(
                new DoubleExpression(1),
                new AdditionalExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                )
        );
        ExpressionPrinterVisitor printerVisitor = new ExpressionPrinterVisitor();
        expression.accept(printerVisitor);
        String completeExpression = printerVisitor.getCompleteExpression();
        System.out.println(completeExpression);

        ExpressionCalculatorVisitor calculatorVisitor = new ExpressionCalculatorVisitor();
        expression.accept(calculatorVisitor);
        System.out.println(completeExpression + " = " + calculatorVisitor.getResult());
    }
}
