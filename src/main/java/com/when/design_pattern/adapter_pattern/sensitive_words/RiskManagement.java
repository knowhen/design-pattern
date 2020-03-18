package com.when.design_pattern.adapter_pattern.sensitive_words;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-13  16:35
 **/
public class RiskManagement {
    private List<SensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(SensitiveWordsFilter filter) {
        filters.add(filter);
    }

    public String filterSensitiveWords(String text) {
        String markedText = text;
        for (SensitiveWordsFilter filter : filters) {
            markedText = filter.filter(markedText);
        }
        return markedText;
    }
}
