package com.when.design_pattern.strategy_pattern.sign;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VipSignerTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private VipSigner signer = new VipSigner();

    // [Start testing sign]
    @Test
    public void invalid_sign_days() {
        exception.expect(IllegalArgumentException.class);
        int continuousDays = -1;
        signer.sign(continuousDays);
    }

    @Test
    public void sign_less_than_7_continuous_days() {
        for (int i = 1; i < 7; i++) {
            int continuousDays = i;
            int points = signer.sign(continuousDays);
            assertEquals(continuousDays, points);
        }
    }

    @Test
    public void sign_equals_or_more_than_7_continuous_days() {
        int continuousDays = 8;
        int points = signer.sign(continuousDays);
        assertEquals(7, points);
    }

    // [End testing sign]

    // [Start testing generate points array]
    @Test
    public void generate_default_points_array() {
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};
        int continuousDays = 7;
        int[] pointsArray = signer.pointsArrayOfLatest7days(continuousDays);
        assertArrayEquals(expectedArray, pointsArray);
    }

    @Test
    public void points_array_of_continuous_more_than_7_days() {
        int[] expectedArray = {4, 5, 6, 7, 7, 7, 7};
        int continuousDays = 10;
        int[] pointsArray = signer.pointsArrayOfLatest7days(continuousDays);
        assertArrayEquals(expectedArray, pointsArray);
    }
    // [End testing generate points array]
}