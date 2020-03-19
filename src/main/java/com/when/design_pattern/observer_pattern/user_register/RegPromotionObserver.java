package com.when.design_pattern.observer_pattern.user_register;

/**
 * @author: when
 * @create: 2020-03-18  22:36
 **/
public class RegPromotionObserver implements RegisterObserver {
    //private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        // promotionService.issueNewUserExperienceCash(userId);
    }

    // 弊端：频繁地创建和销毁线程比较耗时，并且并发线程数无法控制，创建过多的线程会导致堆栈溢出
    public void handleRegSuccessAsync(long userId) {
        Thread thread = new Thread(() -> {
            // promotionService.issueNewUserExperienceCash(userId);
        });
        thread.start();
    }

    //@Subscribe->EventBus annotation
//    public void handleRegSuccess(long userId) {
//        // promotionService.issueNewUserExperienceCash(userId);
//    }
}
