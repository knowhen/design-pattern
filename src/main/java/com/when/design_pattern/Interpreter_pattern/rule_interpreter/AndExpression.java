package com.when.design_pattern.Interpreter_pattern.rule_interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-04-27  15:02
 **/
public class AndExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String expression) {
        String[] exps = expression.split("&&");
        for (String exp : exps) {
            if (exp.contains(">")) {
                expressions.add(new GreaterExpression(exp));
            } else if (exp.contains("<")) {
                expressions.add(new LessExpression(exp));
            } else if (exp.contains("==")) {
                expressions.add(new EqualExpression(exp));
            } else {
                throw new IllegalArgumentException("Expression is invalid: " + expression);
            }
        }
    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressions) {
            if (!expr.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}
