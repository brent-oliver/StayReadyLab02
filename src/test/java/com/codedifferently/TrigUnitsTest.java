package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {

    @Test
    public void switchUnitsModeRotateTest() {
        // Given
        TrigUnits.unitsMode = "Degrees";

        // When
        TrigUnits.switchUnitsMode();
        String actualMode1 = TrigUnits.unitsMode;
        TrigUnits.switchUnitsMode();
        String actualMode2 = TrigUnits.unitsMode;

        // Then
        Assert.assertEquals("Radians", actualMode1);
        Assert.assertEquals("Degrees", actualMode2);
    }

    @Test
    public void switchUnitsModeChoiceTest() {
        // Given
        TrigUnits.unitsMode = "Degrees";

        // When
        TrigUnits.switchUnitsMode("Radians");
        String actualMode1 = TrigUnits.unitsMode;
        TrigUnits.switchUnitsMode("Degrees");
        String actualMode2 = TrigUnits.unitsMode;

        // Then
        Assert.assertEquals("Radians", actualMode1);
        Assert.assertEquals("Degrees", actualMode2);
    }

    @Test
    public void getModeTest() {
        // Given
        TrigUnits.unitsMode = "Radians";

        // When
        String actualMode = TrigUnits.getMode();

        // Then
        Assert.assertEquals(TrigUnits.unitsMode, actualMode);
    }
    
}