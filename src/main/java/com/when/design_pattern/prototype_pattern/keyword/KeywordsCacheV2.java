package com.when.design_pattern.prototype_pattern.keyword;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-05  11:12
 **/
public class KeywordsCacheV2 {
    private HashMap<String, Keyword> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        HashMap<String, Keyword> newKeywords = new LinkedHashMap<>();

        List<Keyword> keywordsToUpdate = getKeywords();
        for (Keyword keyword : keywordsToUpdate) {
            newKeywords.put(keyword.getKeyword(), keyword);
        }
        currentKeywords = newKeywords;
    }

    public void refreshV2() {
        // 拷贝已有对象数据
        HashMap<String, Keyword> copyOfCurrentKeywords = (HashMap<String, Keyword>) currentKeywords.clone();

        // 获取更新时间大于lastUpdateTime的数据
        List<Keyword> keywordsToUpdate = getKeywordsAfter(lastUpdateTime);
        long latestUpdateTime = lastUpdateTime;
        for (Keyword keywordToUpdate : keywordsToUpdate) {
            if (keywordToUpdate.getLastUpdateTime() > latestUpdateTime) {
                latestUpdateTime = keywordToUpdate.getLastUpdateTime();
            }
            if (copyOfCurrentKeywords.containsKey(keywordToUpdate.getKeyword())) {
                copyOfCurrentKeywords.remove(keywordToUpdate.getKeyword());
            }
            copyOfCurrentKeywords.put(keywordToUpdate.getKeyword(), keywordToUpdate);
        }
        lastUpdateTime = latestUpdateTime;
        currentKeywords = copyOfCurrentKeywords;
    }

    /**
     * 从数据库中取出所有关键词
     *
     * @return 关键词列表
     */
    private List<Keyword> getKeywords() {
        return null;
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
