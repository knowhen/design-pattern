package com.when.design_pattern.visitor_pattern;

/**
 * @author: when
 * @create: 2020-04-20  16:08
 **/
public class Extractor implements Visitor {

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Extract pdf...");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Extract word...");
    }
}
