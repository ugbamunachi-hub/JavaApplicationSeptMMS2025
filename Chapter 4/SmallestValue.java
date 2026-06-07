//4.11
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values to input: ");
        int numValues = input.nextInt();
        if (numValues <= 0) return;
        
        System.out.print("Enter value 1: ");
        int smallest = input.nextInt();
        
        for (int i = 2; i <= numValues; i++) {
            System.out.printf("Enter value %d: ", i);
            int current = input.nextInt();
            if (current < smallest) {
                smallest = current;
            }
        }
        System.out.printf("The smallest value is: %d%n", smallest);
    }
}
