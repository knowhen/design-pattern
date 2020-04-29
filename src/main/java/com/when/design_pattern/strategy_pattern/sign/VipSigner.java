package com.when.design_pattern.strategy_pattern.sign;

/**
 * @author: when
 * @create: 2020-04-29  11:42
 **/
public class VipSigner extends AbstractSigner {
    @Override
    public int sign(int continuousDays) {
        if (continuousDays < 0) {
            throw new IllegalArgumentException("Unsupported continuous sign days: " + continuousDays);
        }
        if (continuousDays > 7) {
            return 7;
        }
        return continuousDays;
    }
}
