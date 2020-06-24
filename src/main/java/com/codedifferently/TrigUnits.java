package com.codedifferently;

public class TrigUnits {

    protected static String unitsMode = "Degrees";

    public static void switchUnitsMode() {
        if(unitsMode.equals("Degrees")) {
            unitsMode = "Radians";
        } else {
            unitsMode = "Degrees";
        }
    }

    public static void switchUnitsMode(String mode) {
        if(mode.equalsIgnoreCase("Degrees")) {
            unitsMode = "Degrees";
        } else if(mode.equalsIgnoreCase("Radians")) {
            unitsMode = "Radians";
        } else {
            System.out.println("Err");
        }
    }

    public static String getMode() {
        return unitsMode;
    }
    
}