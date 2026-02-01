// 4)  Develop a Java program that prompts the user to enter a distance in meters and converts it into feet, displaying the result up to two decimal places.


import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        
        double feet = meters * 3.28084;
        System.out.printf("Distance in feet: %.2f\n", feet);
        
        scanner.close();
    }
}