//n.5.33java
import java.util.Scanner;
import java.util.Random;

public class CrapsWager {
    private static final Random randomNumbers = new Random();
    private enum Status { CONTINUE, WON, LOST };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
        
        System.out.printf("Your initial bank balance is: $%d%n", bankBalance);
        System.out.print("Enter your wager: ");
        int wager = input.nextInt();
        
        while (wager > bankBalance || wager <= 0) {
            System.out.print("Invalid wager. Reenter wager: ");
            wager = input.nextInt();
        }
        
        displayChatter();
        
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case 7: case 11:
                gameStatus = Status.WON;
                break;
            case 2: case 3: case 12:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            bankBalance += wager;
            System.out.printf("Player wins! New balance: $%d%n", bankBalance);
        } else {
            bankBalance -= wager;
            System.out.printf("Player loses. New balance: $%d%n", bankBalance);
            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
            }
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        return die1 + die2;
    }

    public static void displayChatter() {
        String[] phrases = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!"
        };
        System.out.println(phrases[randomNumbers.nextInt(phrases.length)]);
    }
}
