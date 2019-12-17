package com.when.design_pattern.liskov_substitution_principle.original;

/**
 * @author: when
 * @create: 2019-12-16  16:41
 **/
public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Response sendRequest(Request request) {
        // use http client to send request
        return null;
    }
}
