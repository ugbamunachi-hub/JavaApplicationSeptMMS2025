//6.17java
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] frequencies = new int[13]; // Indices 2 to 12 will hold the counts

        for (int roll = 0; roll < 36_000_000; roll++) {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            frequencies[die1 + die2]++;
        }

        System.out.printf("%-10s%s%n", "Sum", "Frequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%-10d%d%n", sum, frequencies[sum]);
        }
    }
}
