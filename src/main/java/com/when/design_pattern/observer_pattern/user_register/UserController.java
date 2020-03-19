package com.when.design_pattern.observer_pattern.user_register;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author: when
 * @create: 2020-03-18  22:34
 **/
public class UserController {
    //private UserService userService;
    private List<RegisterObserver> observers = new ArrayList<>();
    private Executor executor;

    public UserController(Executor executor) {
        this.executor = executor;
    }

    public Long register(String telephone, String password) {
//        long userId = userService.register(telephone, password);
        long userId = 0;
        for (RegisterObserver observer : observers) {
            observer.handleRegSuccess(userId);
        }
        return 0L;
    }

    /**
     * 利用了线程池解决了第一种实现方式的问题，
     * 但线程池、异步执行逻辑都耦合在了 register() 函数中，
     * 增加了这部分业务代码的维护成本。
     */
    public Long registerV3(String telephone, String password) {
//        long userId = userService.register(telephone, password);
        long userId = 0;
        for (RegisterObserver observer : observers) {
            executor.execute(() -> observer.handleRegSuccess(userId));
        }
        return userId;
    }

    public void setObservers(List<RegisterObserver> observers) {
        observers.addAll(observers);
    }
}
