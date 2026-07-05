//4java
import java.util.Scanner;

public class InteractivePokerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerWins = 0, computerWins = 0;

        for (int game = 1; game <= 20; game++) {
            System.out.printf("%n=== GAME %d ===%n", game);
            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();
            Card[] playerHand = new Card[5];
            Card[] dealerHand = new Card[5];

            for (int i = 0; i < 5; i++) {
                playerHand[i] = deck.dealCard();
                dealerHand[i] = deck.dealCard();
            }

            System.out.println("Your Hand:");
            for (int i = 0; i < 5; i++) System.out.printf("%d: %s%n", i, playerHand[i]);

            System.out.print("How many cards do you want to replace? (0-3): ");
            int numReplace = input.nextInt();
            for (int i = 0; i < numReplace; i++) {
                System.out.print("Enter index of card to replace (0-4): ");
                playerHand[input.nextInt()] = deck.dealCard();
            }

            if (!deck.hasPair(dealerHand) && !deck.hasFlush(dealerHand)) {
                dealerHand[2] = deck.dealCard();
                dealerHand[3] = deck.dealCard();
                dealerHand[4] = deck.dealCard();
            }

            System.out.println("\nYour final hand:");
            for (Card c : playerHand) System.out.println("  " + c);
            int pRank = TwoHandPoker.evaluateHand(deck, playerHand);

            System.out.println("\nDealer final hand:");
            for (Card c : dealerHand) System.out.println("  " + c);
            int dRank = TwoHandPoker.evaluateHand(deck, dealerHand);

            if (pRank > dRank) { System.out.println("\nYou win this round!"); playerWins++; }
            else if (dRank > pRank) { System.out.println("\nDealer wins this round!"); computerWins++; }
            else System.out.println("\nTie game!");
        }
        System.out.printf("%nFinal Score After 20 Games -> You: %d | Computer: %d%n", playerWins, computerWins);
    }
}