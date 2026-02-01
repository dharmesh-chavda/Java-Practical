// 6) Write a Java program to evaluate expressions and demonstrate operator precedence and associativity.


import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        int result1 = a + b * c; 
        System.out.println("Result of a + b * c: " + result1); 

        int result2 = (a + b) * c; 
        System.out.println("Result of (a + b) * c: " + result2); 

        boolean comparison = a < b && b < c; 
        System.out.println("Is a < b and b < c? " + comparison);

        int result3 = a + b - c * 2; 
        System.out.println("Result of a + b - c * 2: " + result3); 

        int result4 = a - b + c; 
        System.out.println("Result of a - b + c: " + result4); 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int userResult = num1 + num2 * c; 
        System.out.println("Result of user input (num1 + num2 * c): " + userResult);

        scanner.close();
    }
}