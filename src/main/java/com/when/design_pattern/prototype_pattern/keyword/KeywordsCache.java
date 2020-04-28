package com.when.design_pattern.prototype_pattern.keyword;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: when
 * @create: 2020-03-05  10:49
 **/
public class KeywordsCache {
    private ConcurrentHashMap<String, Keyword> currentKeywords = new ConcurrentHashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        List<Keyword> keywordsToUpdate = getKeywordsAfter(lastUpdateTime);
        long latestUpdateTime = lastUpdateTime;
        for (Keyword keywordToUpdate : keywordsToUpdate) {
            if (keywordToUpdate.getLastUpdateTime() > latestUpdateTime) {
                latestUpdateTime = keywordToUpdate.getLastUpdateTime();
            }
            if (currentKeywords.contains(keywordToUpdate.getKeyword())) {
                currentKeywords.replace(keywordToUpdate.getKeyword(), keywordToUpdate);
            } else {
                currentKeywords.put(keywordToUpdate.getKeyword(), keywordToUpdate);
            }
        }
        lastUpdateTime = latestUpdateTime;
    }

    /**
     * 从数据库中取出更新时间大于lastUpdateTime的关键词
     *
     * @param lastUpdateTime
     * @return 更新时间大于lastUpdateTime的关键词列表
     */
    private List<Keyword> getKeywordsAfter(long lastUpdateTime) {
        return null;
    }
}
