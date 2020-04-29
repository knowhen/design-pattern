package com.when.design_pattern.strategy_pattern.sign;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: when
 * @create: 2020-04-29  11:44
 **/
public class SignerFactory {
    private static final Map<String, Signer> signerCaches = new HashMap();

    static {
        signerCaches.put("normal", new NormalSigner());
        signerCaches.put("vip", new VipSigner());
    }

    public static Signer getSigner(String type) {
        if (signerCaches.containsKey(type)) {
            return signerCaches.get(type);
        }
        throw new IllegalArgumentException("Unknown type " + type);
    }
}
