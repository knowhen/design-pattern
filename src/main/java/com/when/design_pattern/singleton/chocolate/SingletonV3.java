package com.when.design_pattern.singleton.chocolate;

/**
 * @author: when
 * @create: 2019-05-16  10:21
 * @description:
 **/
public class SingletonV3 {
    // volatile确保多个线程争取
    private volatile static SingletonV3 instance;

    private SingletonV3() {
    }

    private static SingletonV3 getInstance() {
        // 如果实例不存在， 进入同步区
        if (instance == null) {
            synchronized (SingletonV3.class) {
                // 再次检查实例，如果仍为null，创建实例
                if (instance == null) {
                    instance = new SingletonV3();
                }
            }
        }
        return instance;
    }
}
