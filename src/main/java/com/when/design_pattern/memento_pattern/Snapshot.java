package com.when.design_pattern.memento_pattern;

/**
 * @author: when
 * @create: 2020-04-21  11:06
 **/
public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
