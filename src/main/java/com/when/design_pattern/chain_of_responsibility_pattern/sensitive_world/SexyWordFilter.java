package com.when.design_pattern.chain_of_responsibility_pattern.sensitive_world;

/**
 * @author: when
 * @create: 2020-03-25  10:36
 **/
public class SexyWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(String content) {
        boolean legal = true;
        return legal;
    }
}
