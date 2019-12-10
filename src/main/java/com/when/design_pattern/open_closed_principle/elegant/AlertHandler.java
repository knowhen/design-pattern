package com.when.design_pattern.open_closed_principle.elegant;

import com.when.design_pattern.open_closed_principle.original.AlertRule;
import com.when.design_pattern.open_closed_principle.original.Notification;

/**
 * @author: when
 * @create: 2019-12-10  15:16
 **/
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
