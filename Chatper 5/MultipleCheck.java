//5.16java
import java.util.Scanner;

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
//5.17java
import java.util.Scanner;

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