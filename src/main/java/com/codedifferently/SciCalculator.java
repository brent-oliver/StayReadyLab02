package com.codedifferently;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SciCalculator
{

    protected static double currentValue = 0;
    protected static DisplayMode displayMode;
    protected static TrigFunctions trigFunctions;
    protected static Memory memory;
    protected static CoreFeatures coreFeatures;
    protected static TrigUnits trigUnits;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This is the Display: " + getDisplayValue());

        boolean passed = false;
        while(!passed) {
            try {
                System.out.print("Please enter a value: "); currentValue = keyboard.nextDouble();
                passed = true;
            }
            catch(InputMismatchException err) {
                System.out.print("Err. ");
                keyboard.nextLine();
            }
        }

        System.out.println("What do you want to do with " + getDisplayValue() + ", x?:\n");
        System.out.println("Add(+)\t\t\tSubtract(-)\t\t\tMultiply(*)\t\t\tDivide(/)\n" +
                            "Square(x^2)\t\tSquare Root(sqrt(x))\t\tExponentation(x^y)\t\tInverse(1/x)\n" + 
                            "Switch Sign(+/-)\tsine(x)\t\t\t\tcosine(x)\t\t\ttangent(x)\n" +
                            "Factorial(x!)\t\tarcsin(x)\t\t\tarccos(x)\t\t\tarctan(x))\n" +
                            "log(x)\t\t\tln(x)\t\t\t\te^x\t\t\t\t10^x\n" +
                            "Add to Memory(M+)\tRecall Memory(MRC)\t\tReset Memory(MC)\t\tCube(x^3)\n" +
                            "Inverse ln(e^x)\t\tSwitch Display Mode(SDM)\tSwitch Trig Units Mode(STUM)\t\n" +
                            "Convert to Percent(%)\tChange Current Value(CV)\tClear Display(C)\n");
        System.out.print("Please enter choice [word(s) or symbol]: "); keyboard.nextLine();
        String choice = keyboard.nextLine().toLowerCase();
        do {
            switch(choice) {
                case "add": case "+":
                    passed = false;
                    while(!passed) {
                        try {
                            System.out.print("Please enter value to add: ");
                            double addend = keyboard.nextDouble();
                            CoreFeatures.add(addend); passed = true;
                        }
                        catch(InputMismatchException err) {
                            System.out.print("Err. ");
                            keyboard.nextLine();
                        }
                    } break;
                case "subtract": case "-":
                    passed = false;
                    while(!passed) {
                        try {
                            System.out.print("Please enter value to subtract: ");
                            double subtrahend = keyboard.nextDouble();
                            CoreFeatures.subtract(subtrahend); passed = true;
                        }
                        catch(InputMismatchException err) {
                            System.out.print("Err. ");
                            keyboard.nextLine();
                        }
                    } break;
                case "multiply": case "*":
                    passed = false;
                    while(!passed) {
                        try {
                            System.out.print("Please enter value to multiply: ");
                            double multiplier = keyboard.nextDouble();
                            CoreFeatures.multiply(multiplier); passed = true;
                        }
                        catch(InputMismatchException err) {
                            System.out.print("Err. ");
                            keyboard.nextLine();
                        }
                    } break;
                case "divide": case "/":
                    passed = false;
                    while(!passed) {
                        try {
                            System.out.print("Please enter value to divide: ");
                            double dividend = keyboard.nextDouble();
                            CoreFeatures.divide(dividend); passed = true;
                        }
                        catch(InputMismatchException err) {
                            System.out.print("Err. ");
                            keyboard.nextLine();
                        }
                    } break;
                case "square": case "x^2":
                    CoreFeatures.square(); break;
                case "square root": case "sqrt": case "squareroot": case "sqrt(x)":
                    CoreFeatures.squareRoot(); break;
                case "exponentation": case "exponent": case "x^y":
                    passed = false;
                    while(!passed) {
                        try {
                            System.out.print("Please enter value to raise: ");
                            double exponent = keyboard.nextDouble();
                            CoreFeatures.exponentation(exponent); passed = true;
                        }
                        catch(InputMismatchException err) {
                            System.out.print("Err. ");
                            keyboard.nextLine();
                        }
                    } break;
                case "inverse": case "1/x":
                    CoreFeatures.inverse(); break;
                case "switch sign": case "switchsign": case "+/-":
                    CoreFeatures.switchSign(); break;
                case "sine": case "sin": case "sin(x)": case "sine(x)":
                    TrigFunctions.sine(); break;
                case "cosine": case "cos": case "cosine(x)": case "cos(x)":
                    TrigFunctions.cosine(); break;
                case "tangent": case "tan": case "tangent(x)": case "tan(x)":
                    TrigFunctions.tangent(); break;
                case "arcsine": case "arcsin": case "arcsin(x)": case "arcsine(x)": case "sin^-1": case "sin^-1(x)": case "inverse sin": case "asin":
                    TrigFunctions.inverseSine(); break;
                case "arccosine": case "arccos": case "arccosine(x)": case "arccos(x)": case "cos^-1": case "cos^-1(x)": case "inverse cos": case "acos":
                    TrigFunctions.inverseCosine(); break;
                case "arctangent": case "arctan": case "arctangent(x)": case "arctan(x)": case "tan^-1": case "tan^-1(x)":case "inverse tan": case "atan":
                    TrigFunctions.inverseTan(); break;
                case "factorial": case "x!":
                    BonusCustomFeatures.factorial(); break;
                case "add to memory": case"m+":
                    memory.addToMemory(); break;
                case "recall memory": case "mrc":
                    currentValue = memory.recallMemory(); break;
                case "reset memory": case "mc":
                    memory.resetMemory(); break;
                case "clear display": case "c":
                    clearDisplayValue(); break;
                case "inverse ln": case "e^x":
                    BonusCustomFeatures.exp(); break;
                case "log": case "log10": case "log(x)": case "log10(x)":
                    BonusCustomFeatures.log(); break;
                case "ln": case "natural log": case "ln(x)":
                    BonusCustomFeatures.ln(); break;
                case "10^x": case "inverse log":
                    BonusCustomFeatures.inverseLog(); break;
                case "switch display mode": case "sdm":
                    System.out.print("Enter next to cycle display modes or enter name of display mode [Decimal, Binary, Octal, Hexadecimal]: ");
                    String modeSelect = keyboard.nextLine().toLowerCase();
                    if(modeSelect.equals("next")) {
                        DisplayMode.switchDisplayMode();
                    } else if(modeSelect.equals("decimal")) {
                        DisplayMode.switchDisplayMode("Decimal");
                    } else if(modeSelect.equals("binary")) {
                        DisplayMode.switchDisplayMode("Binary");
                    } else if(modeSelect.equals("octal")) {
                        DisplayMode.switchDisplayMode("Octal");
                    } else if(modeSelect.equals("hexadecimal")) {
                        DisplayMode.switchDisplayMode("Hexadecimal");
                    } else {
                        System.out.println("Err, Invalid mode. Clearing display..."); currentValue = 0;
                    }
                    break;
                case "switch trig units mode": case "switch trig units": case "stum":
                    System.out.print("Enter next to cycle trig units mode or enter name of trig units mode [Degrees or Radians]: ");
                    String trigSelect = keyboard.nextLine().toLowerCase();
                    if(trigSelect.equals("next")) {
                        TrigUnits.switchUnitsMode();
                    } else if(trigSelect.equals("degrees")) {
                        TrigUnits.switchUnitsMode("Degrees");
                    } else if(trigSelect.equals("radians")) {
                        TrigUnits.switchUnitsMode("Radians");
                    } else {
                        System.out.println("Err, Invalid mode. Clearing display..."); currentValue = 0;
                    }
                    break;
                case "cube": case "x^3":
                    BonusCustomFeatures.cube(); break;
                case "percent": case "%": case "convert to percent":
                    BonusCustomFeatures.converToPercent(); break;
                case "change current value": case "cv":
                    passed = false;
                    while(!passed) {
                        try {
                            System.out.print("Enter new value: ");
                            double value = keyboard.nextDouble();
                            setDisplayValue(value); passed = true;
                        }
                        catch(InputMismatchException err) {
                            System.out.print("Err. ");
                            keyboard.nextLine();
                        }
                    } break;
                default:
                    System.out.println("Err, Invalid input. Clearing Display...");
                    currentValue = 0;
            }
            switch (choice) {
                case "add": case "+":
                case "subtract": case "-":
                case "multiply": case "*":
                case "divide": case "/":
                case "exponentation": case "exponent": case "x^y":
                case "change current value": case "cv":
                    System.out.print("\nWhat do you want to do with " + getDisplayValue() + ", x? Enter \"stop\" to end: ");
                    keyboard.nextLine(); break;
                default:
                    System.out.print("\nWhat do you want to do with " + getDisplayValue() + ", x? Enter \"stop\" to end: ");
            }
            choice = keyboard.nextLine().toLowerCase();
        } while(!(choice.equals("stop") || choice.equals("end")));
        
        keyboard.close();
    }

    public static DisplayMode getDisplay() {
        return displayMode;
    }

    public static String getDisplayValue() {

        switch(DisplayMode.whichMode) {
            case "Decimal":
                if(TrigUnits.unitsMode.equals("Radians")) {
                    return currentValue + " - Radians";
                } else {
                    return currentValue + "";
                }
            case "Binary":
                return Integer.toBinaryString((int)currentValue) + " - Binary";
            case "Octal" :
                return Integer.toOctalString((int)currentValue) + " - Octal";
            case "Hexadecimal":
                return Integer.toHexString((int)currentValue) + " - Hexadecimal";
        }
        return "0";
    }

    public static Memory getMemory() {
        return memory;
    }

    public static CoreFeatures getCoreFeatures() {
        return coreFeatures;
    }

    public static void clearDisplayValue() {
        currentValue = 0;
    }

    public static TrigFunctions getTrigFunctions() {
        return trigFunctions;
    }

    public static void setDisplayValue(double value) {
        currentValue = value;
    }

    public static TrigUnits getTrigUnits() {
        return trigUnits;
    }
}
