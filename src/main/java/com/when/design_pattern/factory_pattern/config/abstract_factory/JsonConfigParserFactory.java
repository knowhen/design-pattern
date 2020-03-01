package com.when.design_pattern.factory_pattern.config.abstract_factory;

/**
 * @author: when
 * @create: 2020-03-01  21:06
 **/
public class JsonConfigParserFactory implements ConfigParserFactory {
    @Override
    public RuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
