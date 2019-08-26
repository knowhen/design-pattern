package com.when.design_pattern.mvc_pattern.controller;

import com.when.design_pattern.mvc_pattern.model.HeartAdapter;
import com.when.design_pattern.mvc_pattern.model.HeartModelInterface;
import com.when.design_pattern.mvc_pattern.view.DJView;

/**
 * @author: when
 * @create: 2019-06-24  11:19
 * @Description: TODO:
 **/
public class HeartController implements ControllerInterface {
    private HeartModelInterface heartModel;
    private DJView view;

    public HeartController(HeartModelInterface heartModel) {
        this.heartModel = heartModel;
        view = new DJView(this, new HeartAdapter(heartModel));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBpm() {

    }

    @Override
    public void decreaseBpm() {

    }

    @Override
    public void setBpm(int bpm) {

    }
}
