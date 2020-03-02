package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: when
 * @create: 2020-03-02  09:23
 **/
public class IdGeneratorV1 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorV1 instance = null;

    private IdGeneratorV1() {
    }

    public static IdGeneratorV1 getInstance() {
        if (instance == null) {
            instance = new IdGeneratorV1();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
