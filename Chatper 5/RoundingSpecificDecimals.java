//.5.10java
import java.util.Scanner;

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
