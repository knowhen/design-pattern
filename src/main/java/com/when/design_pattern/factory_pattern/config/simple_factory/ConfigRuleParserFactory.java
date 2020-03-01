package com.when.design_pattern.factory_pattern.config.simple_factory;

import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.JsonConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.XmlConfigParser;

/**
 * @author: when
 * @create: 2020-03-01  20:19
 * <p>
 * 简单工厂方法的第一种实现方式。
 * 缺点：
 * 1.每次调用createConfigParser()时，都要创建一个新的parser，浪费资源，
 * 改进参考${ConfigRuleParserFactoryV2}
 * 2.if-else分支判断逻辑根据实际情况看是否需要使用多态进行重构。
 **/
public class ConfigRuleParserFactory {
    public static ConfigParser createConfigParser(String configFormat) {
        ConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlConfigParser();
        }
        return parser;
    }
}
