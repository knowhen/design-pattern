package com.when.design_pattern.strategy_pattern.file_sort;

/**
 * @author: when
 * @create: 2020-03-24  10:29
 **/
public class AlgRange {
    private long start;
    private long end;
    private SortAlg sortAlg;

    public AlgRange(long start, long end, SortAlg sortAlg) {
        this.start = start;
        this.end = end;
        this.sortAlg = sortAlg;
    }

    public SortAlg getSortAlg() {
        return sortAlg;
    }

    public boolean inRange(long size) {
        return size >= start && size < end;
    }
}
