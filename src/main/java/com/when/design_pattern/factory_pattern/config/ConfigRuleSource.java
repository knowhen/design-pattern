package com.when.design_pattern.factory_pattern.config;

import com.when.design_pattern.factory_pattern.config.exception.InvalidConfigRuleException;
import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.JsonConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.XmlConfigParser;

/**
 * @author: when
 * @create: 2020-03-01  15:44
 **/
public class ConfigRuleSource {
    public ConfigRule load(String ruleConfigPath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigPath);
        ConfigParser parser = createConfigParser(ruleConfigPath, ruleConfigFileExtension);
        String configText = ""; // read from file
        ConfigRule configRule = parser.parse(configText);
        return configRule;
    }

    private ConfigParser createConfigParser(String configRulePath, String fileExtension) {
        ConfigParser parser = null;
        if ("json".equalsIgnoreCase(fileExtension)) {
            parser = new JsonConfigParser();
        } else if ("xml".equalsIgnoreCase(fileExtension)) {
            parser = new XmlConfigParser();
        } else {
            throw new InvalidConfigRuleException("Config rule file format is not support:" + configRulePath);
        }
        return parser;
    }

    private String getFileExtension(String filePath) {
        return "json";
    }
}
