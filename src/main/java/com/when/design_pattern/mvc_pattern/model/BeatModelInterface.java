package com.when.design_pattern.mvc_pattern.model;


import com.when.design_pattern.mvc_pattern.domain.BeatObserver;
import com.when.design_pattern.mvc_pattern.domain.BpmObserver;

/**
 * TODO
 *
 * @author when
 * @date 2019/6/22 16:05
 */
public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    int getBpm();

    void setBpm(int bpm);

    void registerObserver(BeatObserver observer);

    void registerObserver(BpmObserver observer);

//    void removeObserver(BeatObserver observer);
//
//    void removeObserver(BpmObserver observer);
}
