package com.when.design_pattern.prototype_pattern.keyword;

/**
 * @author: when
 * @create: 2020-03-05  10:52
 **/
public class Keyword {
    private String keyword;
    private int searchedTimes;
    private long lastUpdateTime;

    public String getKeyword() {
        return keyword;
    }

    public int getSearchedTimes() {
        return searchedTimes;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setSearchedTimes(int searchedTimes) {
        this.searchedTimes = searchedTimes;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
