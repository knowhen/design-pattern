package com.when.design_pattern.visitor_pattern;

/**
 * @author: when
 * @create: 2020-04-20  16:04
 **/
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
