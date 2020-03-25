package com.when.design_pattern.chain_of_responsibility_pattern.mutation;

/**
 * @author: when
 * @create: 2020-03-25  10:19
 **/
public class App {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }
}
