package com.when.design_pattern.composite_pattern.file;

import java.io.File;

/**
 * @author: when
 * @create: 2020-03-18  09:21
 **/
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();


    public String getPath() {
        return path;
    }
}
