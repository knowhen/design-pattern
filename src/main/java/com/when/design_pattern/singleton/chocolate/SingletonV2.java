package com.when.design_pattern.singleton.chocolate;

/**
 * @author: when
 * @create: 2019-05-16  10:14
 **/
public class SingletonV2 {
    private static SingletonV2 instance = new SingletonV2();

    private SingletonV2() {
    }

    private static SingletonV2 getInstance() {
        return instance;
    }
}
