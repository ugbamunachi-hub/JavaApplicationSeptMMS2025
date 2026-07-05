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