package com.when.design_pattern.factory_pattern.config.factory_method;

import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;

public interface ConfigRuleParserFactoryV3 {
    ConfigParser createConfigParser();
}
