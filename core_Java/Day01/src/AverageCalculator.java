import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first double value:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input is not a double value.");
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second double value:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Input is not a double value.");
            return;
        }
        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);

        scanner.close();
    }
}
