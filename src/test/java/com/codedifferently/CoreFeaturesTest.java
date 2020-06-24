package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test
    public void addTest() {
        // Given
        SciCalculator.currentValue = 3;
        double addend = 25;
        double exptectedValue = SciCalculator.currentValue + addend;

        // When
        CoreFeatures.add(addend);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void subtractTest() {
        // Given
        SciCalculator.currentValue = 28;
        double subtrahend = 3;
        double exptectedValue = SciCalculator.currentValue - subtrahend;

        // When
        CoreFeatures.subtract(subtrahend);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void multiplyTest() {
        // Given
        SciCalculator.currentValue = 10;
        double multiplier = 3;
        double exptectedValue = SciCalculator.currentValue * multiplier;

        // When
        CoreFeatures.multiply(multiplier);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void divideTest() {
        // Given
        SciCalculator.currentValue = 90;
        double dividend = 10;
        double exptectedValue = SciCalculator.currentValue / dividend;

        // When
        CoreFeatures.divide(dividend);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void divideByZeroTest() {
        // Given
        SciCalculator.currentValue = 90;
        double dividend = 0;
        double exptectedValue = 0;

        // When
        CoreFeatures.divide(dividend);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void squareTest() {
        // Given
        SciCalculator.currentValue = 9;
        double exptectedValue = SciCalculator.currentValue * SciCalculator.currentValue;

        // When
        CoreFeatures.square();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void sqrtTest() {
        // Given
        SciCalculator.currentValue = 9;
        double exptectedValue = Math.sqrt(SciCalculator.currentValue);

        // When
        CoreFeatures.squareRoot();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void expTest() {
        // Given
        SciCalculator.currentValue = 2;
        double exponent = 4;
        double exptectedValue = Math.pow(SciCalculator.currentValue, exponent);

        // When
        CoreFeatures.exponentation(exponent);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void inverseTest() {
        // Given
        SciCalculator.currentValue = 4;
        double exptectedValue = 1 / SciCalculator.currentValue;

        // When
        CoreFeatures.inverse();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void inverseZeroTest() {
        // Given
        SciCalculator.currentValue = 0;
        double exptectedValue = 0;

        // When
        CoreFeatures.inverse();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }

    @Test
    public void switchSignTest() {
        // Given
        SciCalculator.currentValue = -7;
        double exptectedValue = -1 * SciCalculator.currentValue;

        // When
        CoreFeatures.switchSign();
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(exptectedValue, actualValue, 0);
    }
    
}