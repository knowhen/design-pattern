package com.when.design_pattern.visitor_pattern;

public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(WordFile wordFile);
}
