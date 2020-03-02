package com.when.design_pattern.singleton.id_generator;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: when
 * @create: 2020-03-02  09:36
 * 线程唯一的单例模式
 **/
public class IdGeneratorV6 {
    private static final ConcurrentHashMap<Long, IdGeneratorV6> instances = new ConcurrentHashMap<>();
    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorV6() {
    }

    public static IdGeneratorV6 getInstance() {
        long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGeneratorV6());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
