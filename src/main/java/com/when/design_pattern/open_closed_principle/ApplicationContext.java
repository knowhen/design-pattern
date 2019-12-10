package com.when.design_pattern.open_closed_principle;

import com.when.design_pattern.open_closed_principle.elegant.AlertV2;
import com.when.design_pattern.open_closed_principle.elegant.ApiStatInfo;
import com.when.design_pattern.open_closed_principle.elegant.TpsAlertHandler;
import com.when.design_pattern.open_closed_principle.original.AlertRule;
import com.when.design_pattern.open_closed_principle.original.Notification;

/**
 * @author: when
 * @create: 2019-12-10  15:23
 **/
public class ApplicationContext {
    private AlertRule alertRule;
    private Notification notification;
    private AlertV2 alert;

    public void initialize() {
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new AlertV2();
        alert.addHandler(new TpsAlertHandler(alertRule, notification));
    }

    public AlertV2 getAlert() {
        return alert;
    }

    public static ApplicationContext getInstance() {
        return instance;
    }

    private static final ApplicationContext instance = new ApplicationContext();

    private ApplicationContext() {
        instance.initialize();
    }

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // set some data...
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
