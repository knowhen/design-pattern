package com.when.design_pattern.singleton.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: when
 * @create: 2020-02-25  16:02
 **/
public class Logger {
    private static final Logger instance = new Logger();
    private FileWriter writer;

    public Logger() {
        File file = new File("./log.txt");
        try {
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
