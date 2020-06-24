package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class BonusCustomFeaturesTest {

    // Bonus

    @Test
    public void factorialTest() {
        // Given
        SciCalculator.currentValue = 6;
        double expectedValue = 6 * 5 * 4 * 3 * 2 * 1;

        // When
        BonusCustomFeatures.factorial();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void expTest() {
        // Given
        SciCalculator.currentValue = 2;
        double expectedValue = Math.exp(SciCalculator.currentValue);

        // When
        BonusCustomFeatures.exp();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void logTest() {
        // Given
        SciCalculator.currentValue = 6;
        double expectedValue = Math.log10(SciCalculator.currentValue);

        // When
        BonusCustomFeatures.log();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void lnTest() {
        // Given
        SciCalculator.currentValue = 6;
        double expectedValue = Math.log(SciCalculator.currentValue);

        // When
        BonusCustomFeatures.ln();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void inverseLogTest() {
        // Given
        SciCalculator.currentValue = 2;
        double expectedValue = 10 * 10;

        // When
        BonusCustomFeatures.inverseLog();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    // Custom

    @Test
    public void cubeTest() {
        // Given
        SciCalculator.currentValue = 4;
        double expectedValue = SciCalculator.currentValue * SciCalculator.currentValue * SciCalculator.currentValue;

        // When
        BonusCustomFeatures.cube();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void convertToPercentTest() {
        // Given
        SciCalculator.currentValue = 54;
        double expectedValue = 0.54;

        // When
        BonusCustomFeatures.converToPercent();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }
    
}