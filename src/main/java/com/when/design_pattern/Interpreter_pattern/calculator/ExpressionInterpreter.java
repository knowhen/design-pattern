package com.when.design_pattern.Interpreter_pattern.calculator;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: when
 * @create: 2020-04-27  10:21
 **/
public class ExpressionInterpreter {
    private Deque<Long> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; ++i) {
            numbers.addLast(Long.parseLong(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new IllegalArgumentException("Expression is invalid " + expression);
            }

            long num1 = numbers.pollFirst();
            long num2 = numbers.pollFirst();
            long result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }
            numbers.addFirst(result);
        }
        if (numbers.size() != 1) {
            throw new IllegalArgumentException("Expression is invalid " + expression);
        }
        return numbers.pop();
    }

    public static void main(String[] args) {
        String expression = "8 3 2 4 - + *";
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        long result = interpreter.interpret(expression);
        System.out.println(result);
    }
}
