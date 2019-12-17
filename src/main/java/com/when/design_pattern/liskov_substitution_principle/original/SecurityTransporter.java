package com.when.design_pattern.liskov_substitution_principle.original;

/**
 * @author: when
 * @create: 2019-12-16  16:44
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
        if(StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(appToken)) {
            request.setPayload(appId);
            request.setPayload(appToken);
        }
        return super.sendRequest(request);
    }
}
