package com.when.design_pattern.mvc_pattern;

import com.when.design_pattern.mvc_pattern.controller.ControllerInterface;
import com.when.design_pattern.mvc_pattern.controller.HeartController;
import com.when.design_pattern.mvc_pattern.model.HeartModel;
import com.when.design_pattern.mvc_pattern.model.HeartModelInterface;

/**
 * @author: when
 * @create: 2019-06-24  09:35
 * @Description: TODO:
 **/
public class App {
    public static void main(String[] args) {
//        BeatModelInterface model = new BeatModel();
//        ControllerInterface controller = new BeatController(model);
        HeartModelInterface model = new HeartModel();
        ControllerInterface controller = new HeartController(model);
    }
}
