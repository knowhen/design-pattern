package com.when.design_pattern.chain_of_responsibility_pattern.sensitive_world;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-25  10:37
 **/
public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    /**
     * @param content
     * @return true if content doesn't contain sensitive words
     */
    public boolean filter(String content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
