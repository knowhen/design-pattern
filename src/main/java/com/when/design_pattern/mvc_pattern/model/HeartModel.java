package com.when.design_pattern.mvc_pattern.model;

import com.when.design_pattern.mvc_pattern.domain.BeatObserver;
import com.when.design_pattern.mvc_pattern.domain.BpmObserver;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: when
 * @create: 2019-06-24  11:23
 * @Description: TODO:
 **/
public class HeartModel implements HeartModelInterface, Runnable {
    ArrayList<BeatObserver> beatObservers = new ArrayList<>();
    ArrayList<BpmObserver> bpmObservers = new ArrayList<>();
    int time = 1000;
    int bpm = 90;
    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        int lastrate = -1;

        for (; ; ) {
            int change = random.nextInt(10);
            if (random.nextInt(2) == 0) {
                change = 0 - change;
            }
            int rate = 60000 / (time + change);
            if (rate < 120 && rate > 50) {
                time += change;
                notifyBeatObservers();
                if (rate != lastrate) {
                    lastrate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(time);
            } catch (Exception e) {
            }
        }
    }

    public int getHeartRate() {
        return 60000 / time;
    }

    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void notifyBeatObservers() {
        for (int i = 0; i < beatObservers.size(); i++) {
            BeatObserver observer = beatObservers.get(i);
            observer.updateBeat();
        }
    }

    public void registerObserver(BpmObserver o) {
        bpmObservers.add(o);
    }

    public void removeObserver(BpmObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    public void notifyBPMObservers() {
        for (int i = 0; i < bpmObservers.size(); i++) {
            BpmObserver observer = bpmObservers.get(i);
            observer.updateBpm();
        }
    }
}
