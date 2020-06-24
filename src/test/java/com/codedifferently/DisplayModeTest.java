package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {

    @Test
    public void switchDisplayModeRotateTest() {
        // Given
        DisplayMode.whichMode = "Decimal";
        String[] expectedModes = {"Binary", "Octal", "Hexadecimal", "Decimal"};
        String[] actualModes = new String[4];

        // When
        for(int i = 0; i < 4; i++) {
            DisplayMode.switchDisplayMode();
            actualModes[i] = DisplayMode.whichMode;
        }

        // Then
        for(int j = 0; j < 4; j++) {
            Assert.assertEquals(expectedModes[j], actualModes[j]);
        }
    }

    @Test
    public void switchDisplayModeChoiceTest() {
        // Given
        DisplayMode.whichMode = "Decimal";
        String[] expectedModes = {"Binary", "Octal", "Hexadecimal", "Decimal"};
        String[] actualModes = new String[4];

        // When
        for(int i = 0; i < 4; i++) {
            DisplayMode.switchDisplayMode(expectedModes[i]);
            actualModes[i] = DisplayMode.whichMode;
        }

        // Then
        for(int j = 0; j < 4; j++) {
            Assert.assertEquals(expectedModes[j], actualModes[j]);
        }

    }
    
    @Test
    public void getModeTest() {
        // Given
        DisplayMode.whichMode = "Binary";

        // When
        String currentMode = DisplayMode.getMode();

        // Then
        Assert.assertEquals(DisplayMode.whichMode, currentMode);
    }
}