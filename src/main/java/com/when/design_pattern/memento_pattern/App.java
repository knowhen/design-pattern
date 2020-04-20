package com.when.design_pattern.memento_pattern;

import java.util.Scanner;

/**
 * @author: when
 * @create: 2020-04-20  16:43
 **/
public class App {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":ls")) {
                System.out.println(inputText.toString());
            } else if (input.equals(":undo")) {
                InputText snapshot = snapshotHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            } else {
                snapshotHolder.pushSnapshot(inputText);
                inputText.append(input);
            }
        }
    }
}
