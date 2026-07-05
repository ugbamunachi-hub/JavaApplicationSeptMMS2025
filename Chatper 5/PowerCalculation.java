//5.14java
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base (integer): ");
        int base = input.nextInt();
        
        System.out.print("Enter exponent (positive integer): ");
        int exponent = input.nextInt();
        
        int result = integerPower(base, exponent);
        System.out.printf("%d to the power of %d is: %d%n", base, exponent, result);
    }

    public static int integerPower(int base, int exponent) {
        int total = 1;
        for (int i = 0; i < exponent; i++) {
            total *= base;
        }
        return total;
    }
}
Use code with caution.5.15javaimport java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side 1: ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter side 2: ");
        double side2 = input.nextDouble();
        
        double hypotenuse = hypotenuse(side1, side2);
        System.out.printf("The hypotenuse length is: %.2f%n", hypotenuse);
    }

    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
Use code with caution.5.16javaimport java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter pairs of integers (Enter 0 to exit):");
        
        while (true) {
            System.out.print("Enter first integer: ");
            int first = input.nextInt();
            if (first == 0) break;
            
            System.out.print("Enter second integer: ");
            int second = input.nextInt();
            
            if (isMultiple(first, second)) {
                System.out.printf("%d is a multiple of %d%n", second, first);
            } else {
                System.out.printf("%d is NOT a multiple of %d%n", second, first);
            }
        }
    }

    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }
}
Use code with caution.5.17javaimport java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        if (isEven(number)) {
            System.out.printf("%d is even.%n", number);
        } else {
            System.out.printf("%d is odd.%n", number);
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}