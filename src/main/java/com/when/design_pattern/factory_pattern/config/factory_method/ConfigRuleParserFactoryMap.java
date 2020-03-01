package com.when.design_pattern.factory_pattern.config.factory_method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-01  20:52
 **/
public class ConfigRuleParserFactoryMap {
    private static final Map<String, ConfigRuleParserFactoryV3> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
    }

    public static ConfigRuleParserFactoryV3 createConfigParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        ConfigRuleParserFactoryV3 parserFactory = cachedFactories.get(type);
        return parserFactory;
    }
}
