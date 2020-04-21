package com.when.design_pattern.memento_pattern;

import java.util.Stack;

/**
 * @author: when
 * @create: 2020-04-20  17:03
 **/
public class SnapshotHolder {
    private Stack<Snapshot> stack = new Stack<>();

    public Snapshot popSnapshot() {
        return stack.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        stack.push(snapshot);
    }
}
