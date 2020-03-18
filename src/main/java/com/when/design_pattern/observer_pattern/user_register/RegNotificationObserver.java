package com.when.design_pattern.observer_pattern.user_register;

/**
 * @author: when
 * @create: 2020-03-18  22:38
 **/
public class RegNotificationObserver implements RegisterObserver {
    // private NotificationService notificationService;
    @Override
    public void handleRegSuccess(long userId) {
        // notificationService.notify(userId, "Welcome...");
    }
}
