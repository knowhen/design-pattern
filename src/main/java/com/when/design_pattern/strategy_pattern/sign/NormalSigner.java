package com.when.design_pattern.strategy_pattern.sign;

/**
 * @author: when
 * @create: 2020-04-29  11:41
 **/
public class NormalSigner extends AbstractSigner {
    @Override
    public int sign(int continuousDays) {
        if (continuousDays < 0) {
            throw new IllegalArgumentException("Unsupported continuous sign days: " + continuousDays);
        }
        if (continuousDays < 3) {
            return 1;
        } else if (continuousDays > 5) {
            return 3;
        } else {
            return 2;
        }
    }

}
