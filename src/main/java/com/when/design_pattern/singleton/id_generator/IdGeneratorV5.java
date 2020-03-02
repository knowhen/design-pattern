package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGeneratorV5 {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
