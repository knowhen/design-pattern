package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: when
 * @create: 2020-03-02  09:21
 **/
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
