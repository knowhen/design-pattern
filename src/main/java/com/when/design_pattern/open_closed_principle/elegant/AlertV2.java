package com.when.design_pattern.open_closed_principle.elegant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2019-12-10  15:15
 **/
public class AlertV2 {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }

}
