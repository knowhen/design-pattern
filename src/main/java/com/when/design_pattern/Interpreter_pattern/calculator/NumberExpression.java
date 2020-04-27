package com.when.design_pattern.Interpreter_pattern.calculator;

/**
 * @author: when
 * @create: 2020-04-27  11:01
 **/
public class NumberExpression implements Expression {
    private long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
