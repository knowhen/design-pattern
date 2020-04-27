package com.when.design_pattern.Interpreter_pattern.calculator;

/**
 * @author: when
 * @create: 2020-04-27  11:07
 **/
public class Division implements Expression {
    private Expression exp1;
    private Expression exp2;

    public Division(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() / exp2.interpret();
    }
}
