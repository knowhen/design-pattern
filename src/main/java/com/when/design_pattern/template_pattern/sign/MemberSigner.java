package com.when.design_pattern.template_pattern.sign;

/**
 * @author: when
 * @create: 2019-06-06  16:43
 * @Description: TODO:
 **/
public class MemberSigner extends AbstractSigner {
    @Override
    protected int accumulatePoints(int consecutiveDays) {
        return consecutiveDays > 7 ? 7 : consecutiveDays;
    }
}
