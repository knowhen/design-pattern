package com.when.design_pattern.liskov_substitution_principle.elegant;

import com.when.design_pattern.liskov_substitution_principle.original.*;

/**
 * @author: when
 * @create: 2019-12-16  16:54
 *
 * This subclass will break the LSP
 **/
public class SecurityTransporter extends Transporter {
    private String appId;
    private String appToken;

    public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public Response sendRequest(Request request) {
        // changed logic of super class
        if(StringUtils.isNotBlank(appId) || StringUtils.isNotBlank(appToken)) {
            throw new RuntimeException("No authorization...");
        }
        return super.sendRequest(request);
    }
}
