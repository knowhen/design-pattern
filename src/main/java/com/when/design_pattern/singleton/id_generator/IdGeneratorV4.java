package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: when
 * @create: 2020-03-02  09:27
 **/
public class IdGeneratorV4 {
    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorV4() {
    }

    public static IdGeneratorV4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    private static class SingletonHolder {
        private static final IdGeneratorV4 INSTANCE = new IdGeneratorV4();
    }
}
