// 8) Write a Java program that accepts two numbers as command-line arguments, converts them to numeric values, performs addition, and displays the result.
public class Practical8 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double sum = num1 + num2;

            System.out.printf("The sum of %.2f and %.2f is %.2f%n", num1, num2, sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure you enter valid numbers.");
        }
    }
}