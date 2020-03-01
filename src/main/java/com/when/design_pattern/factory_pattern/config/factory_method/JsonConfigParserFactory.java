package com.when.design_pattern.factory_pattern.config.factory_method;

import com.when.design_pattern.factory_pattern.config.parser.ConfigParser;
import com.when.design_pattern.factory_pattern.config.parser.JsonConfigParser;

/**
 * @author: when
 * @create: 2020-03-01  20:39
 **/
public class JsonConfigParserFactory implements ConfigRuleParserFactoryV3 {
    @Override
    public ConfigParser createConfigParser() {
        return new JsonConfigParser();
    }
}
