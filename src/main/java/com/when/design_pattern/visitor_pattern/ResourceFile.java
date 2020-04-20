package com.when.design_pattern.visitor_pattern;

/**
 * @author: when
 * @create: 2020-04-20  16:03
 **/
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void accept(Visitor visitor);

}
