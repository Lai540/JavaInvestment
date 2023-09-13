import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting two integer values from the user
        System.out.println("Enter the first integer value:");
        int int1 = scanner.nextInt();

        System.out.println("Enter the second integer value:");
        int int2 = scanner.nextInt();

        // Performing integer arithmetic operations
        int sumInt = int1 + int2;
        int diffInt = int1 - int2;
        int productInt = int1 * int2;
        int quotientInt = int1 / int2;

        // Accepting two double values from the user
        System.out.println("\nFor double values\n");

        System.out.println("Enter the first double value:");
        double double1 = scanner.nextDouble();

        System.out.println("Enter the second double value:");
        double double2 = scanner.nextDouble();

        // Performing double arithmetic operations
        double sumDouble = double1 + double2;
        double diffDouble = double1 - double2;
        double productDouble = double1 * double2;
        double quotientDouble = double1 / double2;

        // Closing the scanner
        scanner.close();

        // Displaying results
        System.out.println("\nAnswers:\n");
        System.out.println("For integer values");
        System.out.println("The sum of the values:\n" + sumInt);
        System.out.println("\nThe difference of the values:\n" + diffInt);
        System.out.println("\nThe product of the values:\n" + productInt);
        System.out.println("\nThe quotient of the values:\n" + quotientInt);

        System.out.println("\nFor double values\n");
        System.out.println("\nThe sum of the values:\n" + String.format("%.1f", sumDouble));
        System.out.println("\nThe difference of the values:\n" + String.format("%.9f", diffDouble));
        System.out.println("\nThe product of the values:\n" + String.format("%.9f", productDouble));
        System.out.println("\nThe quotient of the values:\n" + String.format("%.1f", quotientDouble));
    }
}
