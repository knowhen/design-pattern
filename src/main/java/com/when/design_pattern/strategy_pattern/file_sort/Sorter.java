package com.when.design_pattern.strategy_pattern.file_sort;

import java.io.File;

/**
 * @author: when
 * @create: 2020-03-24  09:49
 **/
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        SortAlg alg = null;
        if (fileSize < 6 * GB) {
            alg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            alg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            new ConcurrentSort();
        } else {
            new MapReduceSort();
        }
        alg.sort(filePath);
    }

}
