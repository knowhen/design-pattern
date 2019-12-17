package com.when.design_pattern.liskov_substitution_principle;

import com.when.design_pattern.liskov_substitution_principle.original.*;

/**
 * @author: when
 * @create: 2019-12-16  16:47
 **/
public class App {
    public static void main(String[] args) {
        App app = new App();
        HttpClient httpClient = new HttpClient();
//        app.demoFunction(new Transporter(httpClient));
        app.demoFunction(new SecurityTransporter(httpClient, "app id", "app token"));
    }

    public void demoFunction(Transporter transporter) {
        Request request = new Request();
        // set request data
        Response response = transporter.sendRequest(request);
    }
}
