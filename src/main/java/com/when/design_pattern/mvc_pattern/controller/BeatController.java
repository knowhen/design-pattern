package com.when.design_pattern.mvc_pattern.controller;


import com.when.design_pattern.mvc_pattern.model.BeatModelInterface;
import com.when.design_pattern.mvc_pattern.view.DJView;

/**
 * TODO
 *
 * @author when
 * @date 2019/6/22 16:52
 */
public class BeatController implements ControllerInterface {
    private BeatModelInterface beatModel;
    private DJView view;

    public BeatController(BeatModelInterface beatModel) {
        this.beatModel = beatModel;
        view = new DJView(this, beatModel);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        beatModel.initialize();
    }

    @Override
    public void start() {
        beatModel.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        beatModel.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void increaseBpm() {
        int bpm = beatModel.getBpm();
        beatModel.setBpm(bpm + 1);
    }

    @Override
    public void decreaseBpm() {
        int bpm = beatModel.getBpm();
        beatModel.setBpm(bpm - 1);
    }

    @Override
    public void setBpm(int bpm) {
        beatModel.setBpm(bpm);
    }
}
