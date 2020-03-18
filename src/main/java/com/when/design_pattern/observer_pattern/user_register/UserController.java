package com.when.design_pattern.observer_pattern.user_register;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-03-18  22:34
 **/
public class UserController {
    //private UserService userService;
    private List<RegisterObserver> observers = new ArrayList<>();

    public Long register(String telephone, String password) {
//        long userId = userService.register(telephone, password);
        long userId = 0;
        for (RegisterObserver observer : observers) {
            observer.handleRegSuccess(userId);
        }
        return 0L;
    }

    public void setObservers(List<RegisterObserver> observers) {
        observers.addAll(observers);
    }
}
