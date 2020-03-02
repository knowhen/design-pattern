package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: when
 * @create: 2020-03-02  09:25
 **/
public class IdGeneratorV2 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorV2 instance = null;

    private IdGeneratorV2() {
    }

    public static synchronized IdGeneratorV2 getInstance() {
        if (instance == null) {
            instance = new IdGeneratorV2();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
