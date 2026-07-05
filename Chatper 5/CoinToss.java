//5.29java
import java.util.Scanner;
import java.util.Random;

public class CoinToss {
    private enum Coin { HEADS, TAILS };
    private static final Random randomNumbers = new Random();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        
        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            
            if (choice != 1) break;
            
            Coin result = flip();
            if (result == Coin.HEADS) {
                headsCount++;
                System.out.println("Result: HEADS");
            } else {
                tailsCount++;
                System.out.println("Result: TAILS");
            }
            
            System.out.printf("Score -> Heads: %d, Tails: %d%n%n", headsCount, tailsCount);
        }
    }

    public static Coin flip() {
        if (randomNumbers.nextInt(2) == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}
