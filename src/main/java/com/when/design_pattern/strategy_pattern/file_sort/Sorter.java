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
        if (fileSize < 6 * GB) {
            quickSort(filePath);
        } else if (fileSize < 10 * GB) {
            externalSort(filePath);
        } else if (fileSize < 100 * GB) {
            concurrentSort(filePath);
        } else {
            mapReduceSort(filePath);
        }
    }

    public void sortFileV2(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        SortAlg alg = null;
        if (fileSize < 6 * GB) {
            alg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            alg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            alg = new ConcurrentSort();
        } else {
            alg = new MapReduceSort();
        }
        alg.sort(filePath);
    }

    public void sortFileV3(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        SortAlg alg = null;
        if (fileSize < 6 * GB) {
            alg = SortAlgFactory.getSortAlg("QuickSort");
        } else if (fileSize < 10 * GB) {
            alg = SortAlgFactory.getSortAlg("ExternalSort");
        } else if (fileSize < 100 * GB) {
            alg = SortAlgFactory.getSortAlg("ConcurrentSort");
        } else {
            alg = SortAlgFactory.getSortAlg("mapReduceSort");
        }
        alg.sort(filePath);
    }

    private void quickSort(String filePath) {

    }

    private void externalSort(String filePath) {

    }

    private void concurrentSort(String filePath) {

    }

    private void mapReduceSort(String filePath) {

    }

}
