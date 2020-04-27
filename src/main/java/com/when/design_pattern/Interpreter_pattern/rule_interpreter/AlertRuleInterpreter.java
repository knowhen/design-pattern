package com.when.design_pattern.Interpreter_pattern.rule_interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-04-27  11:16
 **/
public class AlertRuleInterpreter {
    private Expression expression;

    // key1 > 100 && key2 < 1000 || key3 == 200
    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    // apiStat = new HashMap<>();
    // apiStat.put("key1", 103);
    // apiStat.put("key2", 987);
    public boolean interpret(Map stats) {
        return expression.interpret(stats);
    }

    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map stats = new HashMap<>();
        stats.put("key1", 101L);
        stats.put("key3", 121L);
        stats.put("key4", 88L);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }

}
