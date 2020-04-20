package com.when.design_pattern.memento_pattern;

/**
 * @author: when
 * @create: 2020-04-20  16:57
 **/
public class InputText {
    private StringBuilder builder = new StringBuilder();

    public String getText() {
        return builder.toString();
    }

    public void append(String input) {
        builder.append(input);
    }

    public void setText(String text) {
        this.builder.replace(0, this.builder.length(), text);
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
