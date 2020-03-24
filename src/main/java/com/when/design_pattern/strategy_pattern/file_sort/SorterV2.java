package com.when.design_pattern.strategy_pattern.file_sort;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-24  10:23
 **/
public class SorterV2 {
    private static final long GB = 1000 * 1000 * 1000;
    private static final List<AlgRange> ALG_RANGES = new ArrayList<>();

    static {
        ALG_RANGES.add(new AlgRange(0, 6 * GB, SortAlgFactory.getSortAlg("QuickSort")));
        ALG_RANGES.add(new AlgRange(6 * GB, 10 * GB, SortAlgFactory.getSortAlg("ExternalSort")));
        ALG_RANGES.add(new AlgRange(10 * GB, 100 * GB, SortAlgFactory.getSortAlg("ConcurrentSort")));
        ALG_RANGES.add(new AlgRange(100 * GB, Long.MAX_VALUE, SortAlgFactory.getSortAlg("MapReduceSort")));
    }

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        SortAlg sortAlg = null;
        for (AlgRange algRange : ALG_RANGES) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getSortAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }
}
