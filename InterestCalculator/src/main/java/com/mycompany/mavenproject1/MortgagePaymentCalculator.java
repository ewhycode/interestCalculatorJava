import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Interest Payment Calculator");

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double years = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = scanner.nextInt();

        double interest = calculateInterest(principal, annualInterestRate, years, compoundFrequency);
        double totalAmount = principal + interest;

        System.out.println("Interest Amount: $" + interest);
        System.out.println("Total Amount: $" + totalAmount);

        scanner.close();
    }

    public static double calculateInterest(double principal, double annualInterestRate, double years, int compoundFrequency) {
        double rate = annualInterestRate / 100;
        double base = 1 + (rate / compoundFrequency);
        double exponent = compoundFrequency * years;
        return principal * Math.pow(base, exponent) - principal;
    }
}