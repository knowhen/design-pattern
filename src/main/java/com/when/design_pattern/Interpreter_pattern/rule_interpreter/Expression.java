package com.when.design_pattern.Interpreter_pattern.rule_interpreter;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
