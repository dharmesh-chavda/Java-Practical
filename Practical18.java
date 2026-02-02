// Practical 18 : ATM system – minimum number of currency notes
import java.util.Scanner;
public class Practical18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int[] notes = {2000, 500, 200, 100, 50, 20, 10};

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                amount = amount % notes[i];
                System.out.println(notes[i] + " = " + count);
            }
            if (amount == 0) {
                break;
            }
        }
    }
}
