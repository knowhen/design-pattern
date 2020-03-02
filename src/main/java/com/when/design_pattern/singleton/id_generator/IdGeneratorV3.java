package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: when
 * @create: 2020-03-02  09:26
 **/
public class IdGeneratorV3 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorV3 instance = null;

    private IdGeneratorV3() {
    }

    public static IdGeneratorV3 getInstance() {
        if (instance == null) {
            synchronized (IdGeneratorV3.class) {
                if (instance == null) {
                    instance = new IdGeneratorV3();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
