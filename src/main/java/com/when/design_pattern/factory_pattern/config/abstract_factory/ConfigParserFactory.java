package com.when.design_pattern.factory_pattern.config.abstract_factory;

public interface ConfigParserFactory {
    RuleConfigParser createRuleParser();

    SystemConfigParser createSystemParser();
}
