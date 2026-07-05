//5.22java
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            int fahrenheit = input.nextInt();
            System.out.printf("Celsius equivalent: %d%n", celsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            int celsius = input.nextInt();
            System.out.printf("Fahrenheit equivalent: %d%n", fahrenheit(celsius));
        }
    }

    public static int celsius(int fahrenheit) {
        return (int) (5.0 / 9.0 * (fahrenheit - 32));
    }

    public static int fahrenheit(int celsius) {
        return (int) (9.0 / 5.0 * celsius + 32);
    }
}
Use code with caution.5.23javaimport java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three floating-point numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        double smallest = minimum3(num1, num2, num3);
        System.out.printf("The smallest value is: %f%n", smallest);
    }

    public static double minimum3(double a, double b, double a3) {
        return Math.min(a, Math.min(b, a3));
    }
}
Use code with caution.5.24javapublic class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                displayFactors(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void displayFactors(int number) {
        System.out.print(number + " is perfect. Factors: ");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
Use code with caution.5.25javapublic class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.printf("%nTotal primes found: %d%n", count);
        System.out.println("To find all primes up to n, we must test all numbers up to n.");
    }

    // Part c optimized version using square root limit
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        int limit = (int) Math.sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
Use code with caution.5.26javaimport java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        System.out.printf("Reversed number: %d%n", reverse(number));
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
Use code with caution.5.27javaimport java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        
        System.out.printf("The GCD is: %d%n", gcd(num1, num2));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


