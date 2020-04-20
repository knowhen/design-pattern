package com.when.design_pattern.visitor_pattern;

/**
 * @author: when
 * @create: 2020-04-20  16:05
 **/
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
