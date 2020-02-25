package com.when.design_pattern.the_least_knowledge_principle.elegant;

import com.when.design_pattern.the_least_knowledge_principle.Html;

/**
 * @author: when
 * @create: 2020-01-03  16:14
 **/
public class DocumentFactory {
    private HtmlDownloader downloader;

    public DocumentFactory(HtmlDownloader downloader) {
        this.downloader = downloader;
    }

    public Document createDocument(String url) {
        Html html = downloader.downloadHtml(url);
        return new Document(url, html);
    }
}
