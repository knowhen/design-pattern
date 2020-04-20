package com.when.design_pattern.visitor_pattern;

/**
 * @author: when
 * @create: 2020-04-20  16:14
 **/
public class Compressor implements Visitor {

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Compress pdf...");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Compress word...");
    }
}
