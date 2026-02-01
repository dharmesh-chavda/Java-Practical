// 7) Write a Java program to demonstrate implicit and explicit type conversion between different data types.

public class Practical7 {
    public static void main(String[] args) {
        // Implicit type conversion (widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion:");
        System.out.println("Integer Value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; 
        System.out.println("\nExplicit Conversion:");
        System.out.println("Double Value: " + anotherDoubleValue);
        System.out.println("Converted to Integer: " + anotherIntValue);

        char charValue = 'A';
        int charToInt = charValue; 
        System.out.println("\nCharacter to Integer Conversion:");
        System.out.println("Character Value: " + charValue);
        System.out.println("Converted to Integer (ASCII): " + charToInt);

        int intValueForChar = 66;
        char intToChar = (char) intValueForChar; 
        System.out.println("\nInteger to Character Conversion:");
        System.out.println("Integer Value: " + intValueForChar);
        System.out.println("Converted to Character: " + intToChar);
    }
}

