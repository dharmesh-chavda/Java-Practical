// Practical 15 : Reverse a number using while loop
import java.util.Scanner;
public class Practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }

        System.out.println("Reverse Number = " + rev);
    }
}
