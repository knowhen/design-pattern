package com.when.design_pattern.strategy_pattern.sign;

/**
 * @author: when
 * @create: 2020-04-29  16:16
 **/
public abstract class AbstractSigner implements Signer {
    @Override
    public int[] pointsArrayOfLatest7days(int continuousDays) {
        int days = continuousDays <= 7 ? 7 : continuousDays;
        return generatePointsArray(days);
    }

    private int[] generatePointsArray(int continuousDays) {
        int[] pointsArray = new int[7];
        for (int i = pointsArray.length - 1; i >= 0; i--) {
            pointsArray[i] = sign(continuousDays);
            continuousDays--;
        }
        return pointsArray;
    }
}
