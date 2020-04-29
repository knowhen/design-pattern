package com.when.design_pattern.strategy_pattern.sign;

public interface Signer {
    int sign(int continuousDays);

    int[] pointsArrayOfLatest7days(int continuousDays);
}
