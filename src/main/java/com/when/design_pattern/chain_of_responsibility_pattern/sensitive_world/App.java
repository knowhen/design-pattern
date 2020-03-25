package com.when.design_pattern.chain_of_responsibility_pattern.sensitive_world;

/**
 * @author: when
 * @create: 2020-03-25  10:40
 * <p>
 * 引入第三方敏感词过滤系统，接口不兼容时，
 * 可以参考Adapter pattern的实现方式
 **/
public class App {
    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new SexyWordFilter());
//        filterChain.addFilter(new AdsWordFilter());
//        filterChain.addFilter(new PoliticalWordFilter());
        boolean legal = filterChain.filter("");
        if (!legal) {
            // don't publish
        } else {
            // publish
        }
    }
}
