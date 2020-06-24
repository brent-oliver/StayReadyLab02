package com.codedifferently;

public class DisplayMode {

    protected static String whichMode = "Decimal";

    public static void switchDisplayMode() {
        if(whichMode.equals("Decimal")) {
            whichMode = "Binary";
        } else if(whichMode.equals("Binary")) {
            whichMode = "Octal";
        } else if(whichMode.equals("Octal")) {
            whichMode = "Hexadecimal";
        } else {
            whichMode = "Decimal";
        }
    }

    public static void switchDisplayMode(String mode) {
        if(mode.equalsIgnoreCase("Decimal")) {
            whichMode = "Decimal";
        } else if(mode.equalsIgnoreCase("Binary")) {
            whichMode = "Binary";
        } else if(mode.equalsIgnoreCase("Octal")) {
            whichMode = "Octal";
        } else if(mode.equalsIgnoreCase("Hexadecimal")) {
            whichMode = "Hexadecimal";
        } else {
            System.out.println("Err");
        }
    }

    public static String getMode() {
        return whichMode;
    }
    
}