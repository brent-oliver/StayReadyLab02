package com.codedifferently;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void getDisplayTest() {
        // Given
        DisplayMode expectedDisplay = SciCalculator.displayMode;

        // When
        DisplayMode testDisplay = SciCalculator.getDisplay();

        // Then
        Assert.assertEquals(expectedDisplay, testDisplay);

    }

    @Test
    public void getDisplayValueTest() {
        // Given
        double value = SciCalculator.currentValue = 13;
        String[] displayModes = {"Binary", "Octal", "Hexadecimal", "Decimal"};
        String[] displayModeValues = {Integer.toBinaryString((int)value),
                                    Integer.toOctalString((int)value),
                                    Integer.toHexString((int)value),
                                    value + ""};
        String[] testDisplayValues = new String[4];

        // When
        for(int i = 0; i < 4; i++) {
            DisplayMode.whichMode = displayModes[i];
            testDisplayValues[i] = SciCalculator.getDisplayValue();
        }

        // Then
        for(int j = 0; j < 4; j++) {
            Assert.assertEquals(displayModeValues[j], testDisplayValues[j]);
        }
    }

    @Test
    public void getMemoryTest() {
        // Given
        Memory expectedMemory = SciCalculator.memory;

        // When
        Memory testMemory = SciCalculator.getMemory();

        // Then
        Assert.assertEquals(expectedMemory, testMemory);

    }

    @Test
    public void getCoreFeaturesTest() {
        // Given
        CoreFeatures expectedCoreFeatures = SciCalculator.coreFeatures;

        // When
        CoreFeatures testCoreFeatures = SciCalculator.getCoreFeatures();

        // Then
        Assert.assertEquals(expectedCoreFeatures, testCoreFeatures);

    }

    @Test
    public void clearDisplayValueTest() {
        // Given
        SciCalculator.currentValue = 25;

        // When
        SciCalculator.clearDisplayValue();

        // Then
        Assert.assertEquals(0, SciCalculator.currentValue, 0);

    }

    @Test
    public void getTrigFunctionsTest() {
        // Given
        TrigFunctions expectedTrigFunctions = SciCalculator.trigFunctions;

        // When
        TrigFunctions testTrigFunctions = SciCalculator.getTrigFunctions();

        // Then
        Assert.assertEquals(expectedTrigFunctions, testTrigFunctions);

    }

    @Test
    public void setDisplayValueTest() {
        // Given
        SciCalculator.currentValue = 14;
        double valueChange = 100;

        // When
        SciCalculator.setDisplayValue(valueChange);
        double actualValue = SciCalculator.currentValue;

        // Then
        Assert.assertEquals(valueChange, actualValue, 0);
    }

    @Test
    public void getTrigUnitsTest() {
        // Given
        TrigUnits expectedTrigUnits = SciCalculator.trigUnits;

        // When
        TrigUnits testTrigUnits = SciCalculator.getTrigUnits();

        // Then
        Assert.assertEquals(expectedTrigUnits, testTrigUnits);

    }

}
