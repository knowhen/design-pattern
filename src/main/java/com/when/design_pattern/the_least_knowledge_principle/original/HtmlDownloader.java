package com.when.design_pattern.the_least_knowledge_principle.original;

import com.when.design_pattern.the_least_knowledge_principle.Html;
import com.when.design_pattern.the_least_knowledge_principle.HtmlRequest;

/**
 * @author: when
 * @create: 2020-01-03  16:03
 **/
public class HtmlDownloader {
    private NetworkTransporter transporter;

    public HtmlDownloader(NetworkTransporter transporter) {
        this.transporter = transporter;
    }

    public Html downloadHtml(String url) {
        HtmlRequest request = new HtmlRequest(url);
        byte[] rawHtml = transporter.sendHtmlRequest(request);
        return new Html(rawHtml);
    }
}
