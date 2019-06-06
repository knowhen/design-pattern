package com.when.design_pattern.template_pattern.sign;

import java.time.LocalDate;

/**
 * @author: when
 * @create: 2019-06-06  15:46
 * @Description: TODO:
 **/
public abstract class AbstractSigner {
    public static final int DEFAULT_SIGN_DAYS = 1;

    public int signIn(LocalDate lastSignDate, int consecutiveDays) {
        boolean signedYesterday = signedYesterday(lastSignDate);
        int days = getCurrentConsecutiveDays(signedYesterday, consecutiveDays);
        return accumulatePoints(days);
    }

    public int[] generatePointsArray(int consecutiveDays) {
        int days = consecutiveDays < 7 ? 6 : consecutiveDays;
        int[] pointsArray = new int[7];
        for (int i = pointsArray.length - 1; i >= 0; i--) {
            pointsArray[i] = accumulatePoints(days + 1);
            days--;
        }
        return pointsArray;
    }

    protected abstract int accumulatePoints(int consecutiveDays);

    private boolean signedYesterday(LocalDate signDate) {
        return signDate.equals(LocalDate.now().minusDays(1));
    }

    private int getCurrentConsecutiveDays(boolean signedYesterday, int consecutiveDays) {
        return signedYesterday ? consecutiveDays + 1 : DEFAULT_SIGN_DAYS;
    }

}
