package com.when.design_pattern.factory_pattern.config;

import com.when.design_pattern.factory_pattern.config.exception.InvalidConfigRuleException;
import com.when.design_pattern.factory_pattern.config.factory_method.ConfigRuleParserFactoryV3;
import com.when.design_pattern.factory_pattern.config.factory_method.JsonConfigParserFactory;
import com.when.design_pattern.factory_pattern.config.factory_method.XmlConfigParserFactory;
import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;

/**
 * @author: when
 * @create: 2020-03-01  20:40
 * 工厂类的创建逻辑耦合到了ConfigRuleSourceV3类中，工厂方法的引入让设计
 * 更复杂，解决方案参考ConfigRuleSourceV4
 **/
public class ConfigRuleSourceV3 {
    public ConfigRule load(String ruleConfigPath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigPath);
        ConfigRuleParserFactoryV3 parserFactory = createConfigParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidConfigRuleException("Config rule file format is not support:" + ruleConfigFileExtension);
        }
        ConfigParser parser = parserFactory.createConfigParser();
        String configText = ""; // read from file
        ConfigRule configRule = parser.parse(configText);
        return configRule;
    }

    private ConfigRuleParserFactoryV3 createConfigParserFactory(String fileExtension) {
        ConfigRuleParserFactoryV3 parserFactory = null;
        if ("json".equalsIgnoreCase(fileExtension)) {
            parserFactory = new JsonConfigParserFactory();
        } else if ("xml".equalsIgnoreCase(fileExtension)) {
            parserFactory = new XmlConfigParserFactory();
        }
        return parserFactory;
    }

    private String getFileExtension(String filePath) {
        return "json";
    }
}
