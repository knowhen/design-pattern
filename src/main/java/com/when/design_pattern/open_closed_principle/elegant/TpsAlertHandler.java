package com.when.design_pattern.open_closed_principle.elegant;

import com.when.design_pattern.open_closed_principle.original.AlertRule;
import com.when.design_pattern.open_closed_principle.original.Notification;
import com.when.design_pattern.open_closed_principle.original.NotificationEmergencyLevel;

/**
 * @author: when
 * @create: 2019-12-10  15:20
 **/
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
