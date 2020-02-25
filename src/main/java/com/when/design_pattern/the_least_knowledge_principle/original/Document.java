package com.when.design_pattern.the_least_knowledge_principle.original;

import com.when.design_pattern.the_least_knowledge_principle.Html;

/**
 * @author: when
 * @create: 2020-01-03  16:05
 **/
public class Document {
    private Html html;
    private String url;

    public Document(String url) {
        this.url = url;
        NetworkTransporter transporter = new NetworkTransporter();
        HtmlDownloader downloader = new HtmlDownloader(transporter);
        this.html = downloader.downloadHtml(url);
    }

}
