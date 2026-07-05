//5.8java
import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        double currentCharge;
        
        System.out.println("Enter the hours parked for each customer (enter a negative number to stop):");
        
        while (true) {
            System.out.print("Hours parked: ");
            double hours = input.nextDouble();
            
            if (hours < 0) {
                break;
            }
            
            currentCharge = calculateCharges(hours);
            totalReceipts += currentCharge;
            
            System.out.printf("Current customer charge: $%.2f%n", currentCharge);
            System.out.printf("Running total of receipts: $%.2f%n%n", totalReceipts);
        }
        
        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }

    public static double calculateCharges(double hours) {
        double fee = 2.00; // Minimum fee for up to 3 hours
        if (hours > 3.0) {
            fee += Math.ceil(hours - 3.0) * 0.50;
        }
        // Ensure the charge does not exceed the $10.00 maximum
        return Math.min(fee, 10.00);
    }
}
Use code with caution.5.9javaimport java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter double values (enter 999 to stop):");
        
        while (true) {
            System.out.print("Enter number: ");
            double x = input.nextDouble();
            
            if (x == 999) {
                break;
            }
            
            double y = Math.floor(x + 0.5);
            
            System.out.printf("Original number: %.4f%n", x);
            System.out.printf("Rounded number:  %.0f%n%n", y);
        }
        
        input.close();
    }
}
.5.10javaimport java.util.Scanner;

public class RoundingSpecificDecimals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter double values (enter 999 to stop):");
        
        while (true) {
            System.out.print("Enter number: ");
            double x = input.nextDouble();
            
            if (x == 999) {
                break;
            }
            
            System.out.println("---------------------------------");
            System.out.printf("Original value:      %f%n", x);
            System.out.printf("Rounded to Integer:  %d%n", roundToInteger(x));
            System.out.printf("Rounded to Tenths:   %.1f%n", roundToTenths(x));
            System.out.printf("Rounded to Hundreds: %.2f%n", roundToHundredths(x));
            System.out.printf("Rounded to Thou...:  %.3f%n%n", roundToThousandths(x));
        }
        
        input.close();
    }

    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
