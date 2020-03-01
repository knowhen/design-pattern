package com.when.design_pattern.factory_pattern.config.parser;

import com.when.design_pattern.factory_pattern.config.ConfigRule;

public interface ConfigParser {
    ConfigRule parse(String configText);
}
