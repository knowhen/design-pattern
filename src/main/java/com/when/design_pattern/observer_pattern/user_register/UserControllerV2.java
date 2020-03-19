package com.when.design_pattern.observer_pattern.user_register;

import java.util.List;

/**
 * @author: when
 * @create: 2020-03-19  09:53
 **/
public class UserControllerV2 {
    // private UserService userService;
    // private EventBus eventBus;
    private static final int DEFAULT_EVENT_BUS_THREAD_POOL_SIZE = 20;

    public UserControllerV2() {
        // eventBus = new EventBus(); 同步阻塞
        // eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENT_BUS_THREAD_POOL_SIZE);
    }

    public void setObservers(List<Object> observers) {
        for (Object observer : observers) {
            //eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password) {
        long userId = 0;// long userId = userService.register(telephone, password);
        //eventBus.post(userId);
        return userId;
    }
}
