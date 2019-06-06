package com.when.design_pattern.template_pattern.sign;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DefaultSignerTest {
    private int signDays;
    private int expectedPoints;

    private AbstractSigner signer;

    @Before
    public void setUp() {
        signer = new DefaultSigner();
    }

    @Test
    public void testAccumulatePoints() {
        assertEquals(1, signer.accumulatePoints(2));
        assertEquals(2, signer.accumulatePoints(3));
        assertEquals(2, signer.accumulatePoints(5));
        assertEquals(3, signer.accumulatePoints(6));
        assertEquals(3, signer.accumulatePoints(8));
    }

    @Test
    public void testGenerateDefaultPointsArray() {
        // consecutive sign in 6 days
        int consecutiveDays = 6;
        int[] expectedArray = {1, 1, 2, 2, 2, 3, 3};
        assertPointsArrayEquals(consecutiveDays, expectedArray);
    }

    @Test
    public void testGeneratePointsArray() {
        // consecutive sign in 7 days, but generate points of the 8th day
        int consecutiveDays = 7;
        int[] expectedArray = {1, 2, 2, 2, 3, 3, 3};
        assertPointsArrayEquals(consecutiveDays, expectedArray);
    }

    @Test
    public void testGeneratePointsArrayMoreThan14Days() {
        // consecutive sign in 12 days
        int consecutiveDays = 12;
        int[] expectedArray = {3, 3, 3, 3, 3, 3, 3};
        assertPointsArrayEquals(consecutiveDays, expectedArray);
    }

    private void assertPointsArrayEquals(int consecutiveDays, int[] expectedArray) {
        int[] pointsArray = signer.generatePointsArray(consecutiveDays);
        assertArrayEquals(expectedArray, pointsArray);
    }
}