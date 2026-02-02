// Practical 9 : Check positive number using simple if
import java.util.Scanner;
public class Practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive Number");
        }
    }
}
