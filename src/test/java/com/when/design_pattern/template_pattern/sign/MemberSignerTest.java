package com.when.design_pattern.template_pattern.sign;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MemberSignerTest {
    private AbstractSigner signer;

    @Before
    public void setUp() {
        signer = new MemberSigner();
    }

    @Test
    public void testAccumulatePoints() {
        for (int i = 1; i < 8; i++) {
            assertEquals(i, signer.accumulatePoints(i));
        }
        assertEquals(7, signer.accumulatePoints(8));
    }

    @Test
    public void testGenerateDefaultPointsArray() {
        // consecutive sign in 6 days
        int consecutiveDays = 6;
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};
        assertPointsArrayEquals(consecutiveDays, expectedArray);
    }

    @Test
    public void testGeneratePointsArray() {
        // consecutive sign in 7 days, but generate points of the 8th day
        int consecutiveDays = 7;
        int[] expectedArray = {2, 3, 4, 5, 6, 7, 7};
        assertPointsArrayEquals(consecutiveDays, expectedArray);
    }

    @Test
    public void testGeneratePointsArrayMoreThan14Days() {
        // consecutive sign in 12 days
        int consecutiveDays = 12;
        int[] expectedArray = {7, 7, 7, 7, 7, 7, 7};
        assertPointsArrayEquals(consecutiveDays, expectedArray);
    }

    private void assertPointsArrayEquals(int consecutiveDays, int[] expectedArray) {
        int[] pointsArray = signer.generatePointsArray(consecutiveDays);
        assertArrayEquals(expectedArray, pointsArray);
    }

}