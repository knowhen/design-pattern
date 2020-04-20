package com.when.design_pattern.memento_pattern;

import java.util.Stack;

/**
 * @author: when
 * @create: 2020-04-20  17:03
 **/
public class SnapshotHolder {
    private Stack<InputText> stack = new Stack<>();

    public InputText popSnapshot() {
        return stack.pop();
    }

    public void pushSnapshot(InputText inputText) {
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        stack.push(deepClonedInputText);
    }
}
