package com.when.design_pattern.mvc_pattern.model;

import com.when.design_pattern.mvc_pattern.domain.BeatObserver;
import com.when.design_pattern.mvc_pattern.domain.BpmObserver;

/**
 * @author: when
 * @create: 2019-06-24  11:15
 * @Description: TODO:
 **/
public interface HeartModelInterface {
    int getHeartRate();

    void registerObserver(BeatObserver observer);

    void registerObserver(BpmObserver observer);
}
