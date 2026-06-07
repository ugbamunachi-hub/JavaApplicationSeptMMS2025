//4.31
import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Healthcare", "Vacations"};
        double totalExpenses = 0;
        
        for (String cat : categories) {
            System.out.printf("Enter expenses for %s ($): ", cat);
            totalExpenses += input.nextDouble();
        }
        
        System.out.printf("%nTotal Spending Base: $%,.2f%n", totalExpenses);
        System.out.printf("FairTax (23%% Inclusive Rate): $%,.2f%n", totalExpenses * 0.23);
        System.out.printf("FairTax (30%% Exclusive Rate): $%,.2f%n", totalExpenses * 0.30);
    }
}
Use code with caution.4.32To reach 1.5 billion users: 11 monthsTo reach 2.0 billion users: 18 months