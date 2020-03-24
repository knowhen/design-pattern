package com.when.design_pattern.strategy_pattern.file_sort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-03-24  10:25
 **/
public class SortAlgFactory {
    private static final Map<String, SortAlg> CACHE_ALGS = new HashMap<>();

    static {
        CACHE_ALGS.put("QuickSort", new QuickSort());
        CACHE_ALGS.put("ExternalSort", new ExternalSort());
        CACHE_ALGS.put("ConcurrentSort", new ConcurrentSort());
        CACHE_ALGS.put("MapReduceSort", new MapReduceSort());
    }

    public static SortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type shouldn't be empty.");
        }
        return CACHE_ALGS.get(type);
    }
}
