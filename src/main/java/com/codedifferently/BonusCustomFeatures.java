package com.codedifferently;

public class BonusCustomFeatures {

    // Bonus

    public static double factorial() {
        double fact = 1;
        for(int i = 1; i <= SciCalculator.currentValue; i++) {
            fact *= i;
        }
        SciCalculator.currentValue = fact;
        return SciCalculator.currentValue;
    }

    public static double exp() {
        return SciCalculator.currentValue = Math.exp(SciCalculator.currentValue);
    }

    public static double log() {
        return SciCalculator.currentValue = Math.log10(SciCalculator.currentValue);
    }

    public static double ln() {
        return SciCalculator.currentValue = Math.log(SciCalculator.currentValue);
    }

    public static double inverseLog() {
        return SciCalculator.currentValue = Math.pow(10, SciCalculator.currentValue);
    }

    // Custom

    public static double cube() {
        return SciCalculator.currentValue = Math.pow(SciCalculator.currentValue, 3);
    }

    public static double converToPercent() {
        return SciCalculator.currentValue = SciCalculator.currentValue / 100;
    }

}