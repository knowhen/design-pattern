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
}
