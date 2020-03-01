package com.when.design_pattern.factory_pattern.config.simple_factory;

import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.JsonConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.XmlConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-01  20:22
 * 在V1版本的基础上结合单例模式的思想，先创建好parser对象缓存起来，
 * 当调用createConfigParser()方法时直接取出parser对象使用。
 **/
public class ConfigRuleParserFactoryV2 {
    private static final Map<String, ConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonConfigParser());
        cachedParsers.put("xml", new XmlConfigParser());
    }

    public static ConfigParser createConfigParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;
        }
        ConfigParser configParser = cachedParsers.get(configFormat);
        return configParser;
    }
}
