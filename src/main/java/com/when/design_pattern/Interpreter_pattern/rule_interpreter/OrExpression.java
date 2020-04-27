package com.when.design_pattern.Interpreter_pattern.rule_interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-04-27  14:52
 **/
public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String expression) {
        String[] exps = expression.split("\\|\\|");
        for (String exp : exps) {
            expressions.add(new AndExpression(exp));
        }
    }

    public OrExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressions) {
            if (expr.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}
