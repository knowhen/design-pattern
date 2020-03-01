package com.when.design_pattern.factory_pattern.config;

import com.when.design_pattern.factory_pattern.config.exception.InvalidConfigRuleException;
import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;
import com.when.design_pattern.factory_pattern.config.simple_factory.ConfigRuleParserFactory;

/**
 * @author: when
 * @create: 2020-03-01  20:18
 **/
public class ConfigRuleSourceV2 {
    public ConfigRule load(String ruleConfigPath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigPath);
        ConfigParser parser = ConfigRuleParserFactory.createConfigParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidConfigRuleException("Config rule file format is not support:" + ruleConfigFileExtension);
        }
        String configText = ""; // read from file
        ConfigRule configRule = parser.parse(configText);
        return configRule;
    }

    private String getFileExtension(String filePath) {
        return "json";
    }
}
