package com.when.design_pattern.the_least_knowledge_principle.elegant;

import com.when.design_pattern.the_least_knowledge_principle.Html;

/**
 * @author: when
 * @create: 2020-01-03  16:05
 **/
public class Document {
    private Html html;
    private String url;

    public Document(String url, Html html) {
        this.url = url;
        this.html = html;
    }

}
