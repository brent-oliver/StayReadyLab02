package com.codedifferently;

public class CoreFeatures {

    public static double add(double addend) {
        return SciCalculator.currentValue += addend;
    }

    public static double subtract(double subtrahend) {
        return SciCalculator.currentValue -= subtrahend;
    }

    public static double multiply(double multiplier) {
        return SciCalculator.currentValue *= multiplier;
    }

    public static double divide(double dividend) {
        if(dividend == 0) {
            System.out.println("Err, clearing display...");
            SciCalculator.currentValue = 0;
            return 0;
        } else {
            return SciCalculator.currentValue /= dividend;
        }
    }

    public static double square() {
        return SciCalculator.currentValue *= SciCalculator.currentValue;
    }

    public static double squareRoot() {
        return SciCalculator.currentValue = Math.sqrt(SciCalculator.currentValue);
    }

    public static double exponentation(double exponent) {
        return SciCalculator.currentValue = Math.pow(SciCalculator.currentValue, exponent);
    }

    public static double inverse() {
        if(SciCalculator.currentValue == 0) {
            System.out.println("Err, clearing display...");
            return SciCalculator.currentValue = 0;
        } else {
            return SciCalculator.currentValue = 1 / SciCalculator.currentValue; 
        }
    }

    public static double switchSign() {
        return SciCalculator.currentValue *= -1;
    }
    
}