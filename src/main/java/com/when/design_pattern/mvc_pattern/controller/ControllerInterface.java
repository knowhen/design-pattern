package com.when.design_pattern.mvc_pattern.controller;

/**
 * TODO
 *
 * @author qiuhongyu
 * @date 2019/6/22 16:29
 */
public interface ControllerInterface {
    void start();

    void stop();

    void increaseBpm();

    void decreaseBpm();

    void setBpm(int bpm);
}
