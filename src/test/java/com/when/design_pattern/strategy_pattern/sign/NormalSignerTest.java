package com.when.design_pattern.strategy_pattern.sign;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NormalSignerTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private NormalSigner signer = new NormalSigner();

    // [Start testing sign]
    @Test
    public void invalid_sign_days() {
        exception.expect(IllegalArgumentException.class);
        int continuousDays = -1;
        signer.sign(continuousDays);
    }

    @Test
    public void sign_less_than_3_continuous_days() {
        int continuousDays = 2;
        int points = signer.sign(continuousDays);
        assertEquals(1, points);
    }

    @Test
    public void sign_between_3_and_5_continuous_days() {
        int continuousDays = 4;
        int points = signer.sign(continuousDays);
        assertEquals(2, points);
    }

    @Test
    public void sign_more_than_5_continuous_days() {
        int continuousDays = 6;
        int points = signer.sign(continuousDays);
        assertEquals(3, points);
    }
    // [End testing sign]

    // [Start testing generate points array]
    @Test
    public void generate_default_points_array() {
        int[] expectedArray = {1, 1, 2, 2, 2, 3, 3};
        int continuousDays = 7;
        int[] pointsArray = signer.pointsArrayOfLatest7days(continuousDays);
        assertArrayEquals(expectedArray, pointsArray);
    }

    @Test
    public void points_array_of_continuous_more_than_7_days() {
        int[] expectedArray = {2, 2, 3, 3, 3, 3, 3};
        int continuousDays = 10;
        int[] pointsArray = signer.pointsArrayOfLatest7days(continuousDays);
        assertArrayEquals(expectedArray, pointsArray);
    }
    // [End testing generate points array]
}