package com.codedifferently;

public class TrigFunctions {

    public static double sine() {
        if(TrigUnits.unitsMode.equals("Degrees")) {
            return SciCalculator.currentValue = Math.sin(Math.toRadians(SciCalculator.currentValue));
        } else {
            return SciCalculator.currentValue = Math.sin(SciCalculator.currentValue);
        }
    }

    public static double cosine() {
        if(TrigUnits.unitsMode.equals("Degrees")) {
            return SciCalculator.currentValue = Math.cos(Math.toRadians(SciCalculator.currentValue));
        } else {
            return SciCalculator.currentValue = Math.cos(SciCalculator.currentValue);
        }
        
    }

    public static double tangent() {
        if(TrigUnits.unitsMode.equals("Degrees")) {
            return SciCalculator.currentValue = Math.tan(Math.toRadians(SciCalculator.currentValue));
        } else {
            return SciCalculator.currentValue = Math.tan(SciCalculator.currentValue);
        }
        }

    public static double inverseSine() {
        if(TrigUnits.unitsMode.equals("Degrees")) {
            return SciCalculator.currentValue = Math.asin(Math.toRadians(SciCalculator.currentValue));
        } else {
            return SciCalculator.currentValue = Math.asin(SciCalculator.currentValue);
        }
    }

    public static double inverseCosine() {
        if(TrigUnits.unitsMode.equals("Degrees")) {
            return SciCalculator.currentValue = Math.acos(Math.toRadians(SciCalculator.currentValue));
        } else {
            return SciCalculator.currentValue = Math.acos(SciCalculator.currentValue);
        }
        }

    public static double inverseTan() {
        if(TrigUnits.unitsMode.equals("Degrees")) {
            return SciCalculator.currentValue = Math.atan(Math.toRadians(SciCalculator.currentValue));
        } else {
            return SciCalculator.currentValue = Math.atan(SciCalculator.currentValue);
        }
        
    }
    
}