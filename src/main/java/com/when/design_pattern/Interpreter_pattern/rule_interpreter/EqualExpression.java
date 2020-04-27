package com.when.design_pattern.Interpreter_pattern.rule_interpreter;

import java.util.Map;

/**
 * @author: when
 * @create: 2020-04-27  15:12
 **/
public class EqualExpression implements Expression {
    private String key;
    private long value;

    public EqualExpression(String expression) {
        String[] elements = expression.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals("==")) {
            throw new IllegalArgumentException("Expression is invalid: " + expression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    public EqualExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        long statValue = stats.get(key);
        return statValue == value;
    }
}
