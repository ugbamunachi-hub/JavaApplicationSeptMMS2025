//.6.19java
import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 5 products (Rows 0-4), 4 salespeople (Cols 0-3)
        double[][] sales = new double[5][4]; 

        System.out.println("Enter sales slips data (Enter salesperson 0 to stop):");
        while (true) {
            System.out.print("Enter Salesperson number (1-4): ");
            int person = input.nextInt();
            if (person == 0) break;

            System.out.print("Enter Product number (1-5): ");
            int product = input.nextInt();

            System.out.print("Enter total dollar value sold: ");
            double value = input.nextDouble();

            if (person >= 1 && person <= 4 && product >= 1 && product <= 5 && value >= 0) {
                sales[product - 1][person - 1] += value;
            } else {
                System.out.println("Invalid entry. Try again.");
            }
        }

        // Print header
        System.out.printf("%n%-12s%-10s%-10s%-10s%-10s%-10s%n", "Product", "Sales 1", "Sales 2", "Sales 3", "Sales 4", "Total");

        double[] personTotals = new double[4];

        // Print rows with cross-totals
        for (int row = 0; row < 5; row++) {
            double productTotal = 0;
            System.out.printf("Product %-5d", (row + 1));
            
            for (int col = 0; col < 4; col++) {
                System.out.printf("%-10.2f", sales[row][col]);
                productTotal += sales[row][col];
                personTotals[col] += sales[row][col];
            }
            System.out.printf("%-10.2f%n", productTotal);
        }

        // Print bottom cross-totals
        System.out.printf("%-12s", "Total");
        double grandTotal = 0;
        for (int col = 0; col < 4; col++) {
            System.out.printf("%-10.2f", personTotals[col]);
            grandTotal += personTotals[col];
        }
        System.out.printf("%-10.2f%n", grandTotal);
    }
}
