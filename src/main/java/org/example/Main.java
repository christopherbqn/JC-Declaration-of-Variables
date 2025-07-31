package org.example;

public class Main {

    // instance variables
    int instanceBinary = 0b101101; // 45 in decimal
    int instanceOctal = 072;       // 58 in decimal
    double instanceDouble = 1_234.95;

    // local variables
    public static void localVariables(){

        int localDecimal = 100;
        int localHex = 0xFF; // 255 in Hex
        int localBinary = 0b1101; // 100 in Binary
        int localOctal = 014; // 12 in Octal
        long localLong = 10000000L;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.println("Local Variables:");
        System.out.println("  localDecimal = " + localDecimal);
        System.out.println("  localHex = " + localHex);
        System.out.println("  localOctal = " + localOctal);
        System.out.println("  localLong = " + localLong);
        System.out.println("  localString = " + localString);
        System.out.println();
    }

    // static variables
    static int staticHex = 0x1A2B; // 6699 in decimal
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

    public static void main(String[] args) {

        // call local variables
        localVariables();

        // instance variables print
        Main obj = new Main();

        System.out.println("Instance Variables:");
        System.out.println("  instanceBinary = " + obj.instanceBinary);
        System.out.println("  instanceOctal = " + obj.instanceOctal);
        System.out.println("  instanceDouble = " + obj.instanceDouble);
        System.out.println();

        // static variables print
        System.out.println("Static Variables:");
        System.out.println("  staticHex = " + staticHex);
        System.out.println("  staticByte = " + staticByte);
        System.out.println("  staticString = " + staticString);
    }

}