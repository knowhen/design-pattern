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

    public Snapshot createSnapshot() {
        return new Snapshot(builder.toString());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.builder.replace(0, builder.length(), snapshot.getText());
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
