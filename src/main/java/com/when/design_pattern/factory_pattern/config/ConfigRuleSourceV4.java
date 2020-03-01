package com.when.design_pattern.factory_pattern.config;

import com.when.design_pattern.factory_pattern.config.exception.InvalidConfigRuleException;
import com.when.design_pattern.factory_pattern.config.factory_method.ConfigRuleParserFactoryMap;
import com.when.design_pattern.factory_pattern.config.factory_method.ConfigRuleParserFactoryV3;
import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;

/**
 * @author: when
 * @create: 2020-03-01  20:50
 * 当前场景使用工厂方法并不合适。
 * 缺点：
 * 1.额外创建了诸多Factory类，增加代码复杂性
 * 2.Factory类只做了简单的new操作，功能单一
 **/
public class ConfigRuleSourceV4 {
    public ConfigRule load(String ruleConfigPath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigPath);
        ConfigRuleParserFactoryV3 parserFactory = ConfigRuleParserFactoryMap.createConfigParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidConfigRuleException("Config rule file format is not support:" + ruleConfigFileExtension);
        }
        ConfigParser parser = parserFactory.createConfigParser();
        String configText = ""; // read from file
        ConfigRule configRule = parser.parse(configText);
        return configRule;
    }

    private String getFileExtension(String filePath) {
        return "json";
    }
}
