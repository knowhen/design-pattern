package com.when.design_pattern.mvc_pattern.model;

import com.when.design_pattern.mvc_pattern.domain.BeatObserver;
import com.when.design_pattern.mvc_pattern.domain.BpmObserver;

/**
 * @author: when
 * @create: 2019-06-24  11:16
 * @Description: TODO:
 **/
public class HeartAdapter implements BeatModelInterface {
    private HeartModelInterface heartModel;

    public HeartAdapter(HeartModelInterface heartModel) {
        this.heartModel = heartModel;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int getBpm() {
        return heartModel.getHeartRate();
    }

    @Override
    public void setBpm(int bpm) {

    }

    @Override
    public void registerObserver(BeatObserver observer) {
        heartModel.registerObserver(observer);
    }

    @Override
    public void registerObserver(BpmObserver observer) {
        heartModel.registerObserver(observer);
    }
}
