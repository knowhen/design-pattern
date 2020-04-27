package com.when.design_pattern.Interpreter_pattern.calculator;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: when
 * @create: 2020-04-27  10:59
 **/
public class ExpressionInterpreterV2 {
    private Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; ++i) {
            numbers.addLast(new NumberExpression(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new IllegalArgumentException("Expression is invalid " + expression);
            }

            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            Expression combinedExp = null;
            long result = 0;
            if (operator.equals("+")) {
                combinedExp = new Addition(exp1, exp2);
            } else if (operator.equals("-")) {
                combinedExp = new Subtraction(exp1, exp2);
            } else if (operator.equals("*")) {
                combinedExp = new Multiplication(exp1, exp2);
            } else if (operator.equals("/")) {
                combinedExp = new Division(exp1, exp2);
            }
            result = combinedExp.interpret();
            numbers.addFirst(new NumberExpression(result));
        }
        if (numbers.size() != 1) {
            throw new IllegalArgumentException("Expression is invalid " + expression);
        }
        return numbers.pop().interpret();
    }

    public static void main(String[] args) {
        String expression = "8 3 2 4 - + *";
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        long result = interpreter.interpret(expression);
        System.out.println(result);
    }
}
