// Practical 13 : Menu driven program using switch-case with String
import java.util.Scanner;
public class Practical13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (add / sub / mul / div): ");
        String choice = sc.next();

        switch (choice) {
            case "add":
                System.out.println("Addition Selected");
                break;
            case "sub":
                System.out.println("Subtraction Selected");
                break;
            case "mul":
                System.out.println("Multiplication Selected");
                break;
            case "div":
                System.out.println("Division Selected");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
