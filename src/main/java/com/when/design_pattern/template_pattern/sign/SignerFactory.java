package com.when.design_pattern.template_pattern.sign;

/**
 * @author: when
 * @create: 2018-12-25  11:43
 **/
public class SignerFactory {
    public AbstractSigner createSigner(UserType userType) {
        AbstractSigner signer;
        if (userType.equals(UserType.VIP)) {
            signer = new MemberSigner();
        } else {
            signer = new DefaultSigner();
        }
        return signer;
    }
}
