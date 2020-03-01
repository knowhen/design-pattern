package com.when.design_pattern.factory_pattern.config.exception;

/**
 * @author: when
 * @create: 2020-03-01  19:51
 **/
public class InvalidConfigRuleException extends RuntimeException {
    public InvalidConfigRuleException(String message) {
        super(message);
    }
}
