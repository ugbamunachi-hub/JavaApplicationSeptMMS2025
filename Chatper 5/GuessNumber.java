//.5.30java
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumbers = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int secretNumber = 1 + randomNumbers.nextInt(1000);
            System.out.println("Guess a number between 1 and 1000.");
            int guess = 0;
            
            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                
                if (guess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                }
            }
            
            System.out.println("Congratulations. You guessed the number!");
            System.out.print("Play again? (1 for Yes, 0 for No): ");
            playAgain = input.nextInt() == 1;
        }
    }
}
/