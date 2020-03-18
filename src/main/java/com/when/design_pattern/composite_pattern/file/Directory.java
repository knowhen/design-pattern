package com.when.design_pattern.composite_pattern.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-18  09:53
 * <p>
 * countNumOfFiles() 和 countSizeOfFiles() 这两个函数实现的效率不高，
 * 因为每次调用它们的时候，都要重新遍历一遍子树。如何提高效率？
 * PS:文件系统涉及频繁删除、添加文件
 * 解决方案：
 * 递归代码中重复计算的问题，用散列表维护每个(path, size)，通过路径
 * 直接返回对应的size，添加/删除时维护这个size
 **/
public class Directory extends FileSystemNode {
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    @Override
    public long countSizeOfFiles() {
        long sizeOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeOfFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; i++) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
        subNodes.remove(fileOrDir);
    }
}
