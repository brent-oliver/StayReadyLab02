package com.codedifferently;

public class Memory {

    protected double memoryValue = 0;

    public void addToMemory() {
        memoryValue += SciCalculator.currentValue;
    }
    public void resetMemory() {
        memoryValue = 0;
    }

    public double recallMemory() {
        return memoryValue;
    }
    
}