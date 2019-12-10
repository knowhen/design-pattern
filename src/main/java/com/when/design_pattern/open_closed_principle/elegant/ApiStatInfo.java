package com.when.design_pattern.open_closed_principle.elegant;

/**
 * @author: when
 * @create: 2019-12-10  15:16
 **/
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long timeoutCount;
    private long durationOfSeconds;

    public String getApi() {
        return api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public long getTimeoutCount() {
        return timeoutCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }
}
