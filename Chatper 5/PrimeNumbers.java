//5.25java
public class PrimeNumbers {
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
//5.26java
import java.util.Scanner;

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
