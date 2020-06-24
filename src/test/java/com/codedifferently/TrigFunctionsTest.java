package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {

    @Test
    public void sineTest() {
        // Given
        SciCalculator.currentValue = 90;
        double expectedValue = Math.sin(Math.toRadians(SciCalculator.currentValue));

        // When
        TrigFunctions.sine();
        double actualValue = SciCalculator.currentValue;
        
        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void cosineTest() {
        // Given
        SciCalculator.currentValue = 90;
        double expectedValue = Math.cos(Math.toRadians(SciCalculator.currentValue));

        // When
        TrigFunctions.cosine();
        double actualValue = SciCalculator.currentValue;
        
        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void tangentTest() {
        // Given
        SciCalculator.currentValue = 90;
        double expectedValue = Math.tan(Math.toRadians(SciCalculator.currentValue));

        // When
        TrigFunctions.tangent();
        double actualValue = SciCalculator.currentValue;
        
        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void inverseSineTest() {
        // Given
        SciCalculator.currentValue = 90;
        double expectedValue = Math.asin(Math.toRadians(SciCalculator.currentValue));

        // When
        TrigFunctions.inverseSine();
        double actualValue = SciCalculator.currentValue;
        
        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void inverseCosineTest() {
        // Given
        SciCalculator.currentValue = 90;
        double expectedValue = Math.acos(Math.toRadians(SciCalculator.currentValue));

        // When
        TrigFunctions.inverseCosine();
        double actualValue = SciCalculator.currentValue;
        
        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void inverseTanTest() {
        // Given
        SciCalculator.currentValue = 90;
        double expectedValue = Math.atan(Math.toRadians(SciCalculator.currentValue));

        // When
        TrigFunctions.inverseTan();
        double actualValue = SciCalculator.currentValue;
        
        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }
    
}