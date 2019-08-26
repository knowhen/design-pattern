package com.when.design_pattern.mvc_pattern.model;

import com.when.design_pattern.mvc_pattern.domain.BeatObserver;
import com.when.design_pattern.mvc_pattern.domain.BpmObserver;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author when
 * @date 2019/6/22 16:09
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private int bpm = 90;
    private List<BeatObserver> beatObservers = new ArrayList<>();
    private List<BpmObserver> bpmObservers = new ArrayList<>();

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        System.out.println("Starting the sequencer...");
        sequencer.start();
        setBpm(90);
    }

    @Override
    public void off() {
        setBpm(0);
        sequencer.stop();
    }

    @Override
    public int getBpm() {
        return bpm;
    }

    @Override
    public void setBpm(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBpm());
        notifyBpmObservers();
    }

    public void beatEvent() {
        notifyBeatObservers();
    }

    public void registerObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }

    public void notifyBeatObservers() {
        for (BeatObserver observer : beatObservers) {
            observer.updateBeat();
        }
    }

    public void removeObserver(BpmObserver observer) {
        int i = bpmObservers.indexOf(observer);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void registerObserver(BpmObserver observer) {
        bpmObservers.add(observer);
    }

    public void notifyBpmObservers() {
        for (BpmObserver observer : bpmObservers) {
            observer.updateBpm();
        }
    }

    public void removeObserver(BeatObserver observer) {
        int i = beatObservers.indexOf(observer);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBpm());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int track) {
        MidiEvent event = null;
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(comd, chan, one, two);
            event = new MidiEvent(message, track);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBpm(getBpm());
        }
    }
}
