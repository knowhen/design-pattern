package com.when.design_pattern.chain_of_responsibility_pattern.basic;

/**
 * @author: when
 * @create: 2020-03-25  10:06
 **/
public class App {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new AHandler());
        chain.addHandler(new BHandler());
        chain.addHandler(new CHandler());
        chain.handle();
    }
}
