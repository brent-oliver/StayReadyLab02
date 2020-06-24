package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test
    public void addToMemoryTest() {
        // Given
        Memory testMemory = new Memory();
        SciCalculator.currentValue = 3;
        double expectedValue = testMemory.memoryValue + SciCalculator.currentValue;

        // When
        testMemory.addToMemory();
        double actualMemoryValue = testMemory.memoryValue;

        // Then
        Assert.assertEquals(expectedValue, actualMemoryValue, 0);
    }

    @Test
    public void resetMemoryTest() {
        // Given
        Memory testMemory = new Memory();
        testMemory.memoryValue = 3;

        // When
        testMemory.resetMemory();
        double actualMemoryValue = testMemory.memoryValue;

        // Then
        Assert.assertEquals(0, actualMemoryValue, 0);
    }

    @Test
    public void recallMemoryTest() {
        // Given
        Memory testMemory = new Memory();
        double expectedValue = testMemory.memoryValue;

        // When
        double actualValue = testMemory.recallMemory();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0);
    }
    
}