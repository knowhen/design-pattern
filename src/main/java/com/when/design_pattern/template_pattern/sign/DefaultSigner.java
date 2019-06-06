package com.when.design_pattern.template_pattern.sign;


/**
 * @author: when
 * @create: 2019-06-06  15:57
 * @Description: TODO:
 **/
public class DefaultSigner extends AbstractSigner {

    @Override
    protected int accumulatePoints(int consecutiveDays) {
        if (consecutiveDays < 3) {
            return 1;
        } else if (consecutiveDays > 5) {
            return 3;
        } else {
            return 2;
        }
    }

}
