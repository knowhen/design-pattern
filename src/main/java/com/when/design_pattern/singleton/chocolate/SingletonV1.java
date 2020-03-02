package com.when.design_pattern.singleton.chocolate;

/**
 * @author: when
 * @create: 2019-05-14  11:04
 **/
public class SingletonV1 {
    private static SingletonV1 instance;

    private SingletonV1() {
    }

    public static synchronized SingletonV1 getInstance() {
        if (instance == null) {
            instance = new SingletonV1();
        }
        return instance;
    }
}
