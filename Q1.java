import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        // Creatting a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Let us prompt the user to enter the investment amount
        System.out.println("Please enter the investment amount:");
        double investmentAmount = scanner.nextDouble();

        // Prompting the user to enter the monthly interest rate
        System.out.println("Please enter the monthly interest rate:");
        double monthlyInterestRate = scanner.nextDouble();

        // Prompting the user to enter the number of years
        System.out.println("Please enter the number of years:");
        int years = scanner.nextInt();

        // Closing the scanner to free up resources
        scanner.close();

        // Calculating the future value of the investment
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years);

        // Formatting and displaying the result
        System.out.println("\nThe future value of the investment is: $" + String.format("%.2f", futureValue));
    }
}
