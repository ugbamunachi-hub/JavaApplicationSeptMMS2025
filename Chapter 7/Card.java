//1java
public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String getFace() { return face; }
    public String getSuit() { return suit; }
    public String toString() { return face + " of " + suit; }
}
Use code with caution.javaimport java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        return currentCard < deck.length ? deck[currentCard++] : null;
    }

    private int[] getFaceCounts(Card[] hand) {
        int[] counts = new int[13];
        for (Card card : hand) {
            for (int i = 0; i < faces.length; i++) {
                if (card.getFace().equals(faces[i])) { counts[i]++; break; }
            }
        }
        return counts;
    }

    private int[] getSuitCounts(Card[] hand) {
        int[] counts = new int[4];
        for (Card card : hand) {
            for (int i = 0; i < suits.length; i++) {
                if (card.getSuit().equals(suits[i])) { counts[i]++; break; }
            }
        }
        return counts;
    }

    public boolean hasPair(Card[] hand) {
        for (int count : getFaceCounts(hand)) { if (count == 2) return true; }
        return false;
    }

    public boolean hasTwoPairs(Card[] hand) {
        int pairs = 0;
        for (int count : getFaceCounts(hand)) { if (count == 2) pairs++; }
        return pairs == 2;
    }

    public boolean hasThreeOfAKind(Card[] hand) {
        for (int count : getFaceCounts(hand)) { if (count == 3) return true; }
        return false;
    }

    public boolean hasFourOfAKind(Card[] hand) {
        for (int count : getFaceCounts(hand)) { if (count == 4) return true; }
        return false;
    }

    public boolean hasFlush(Card[] hand) {
        for (int count : getSuitCounts(hand)) { if (count == 5) return true; }
        return false;
    }

    public boolean hasStraight(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int i = 0; i <= 8; i++) {
            if (counts[i] == 1 && counts[i+1] == 1 && counts[i+2] == 1 && counts[i+3] == 1 && counts[i+4] == 1) return true;
        }
        return counts[9] == 1 && counts[10] == 1 && counts[11] == 1 && counts[12] == 1 && counts[0] == 1;
    }

    public boolean hasFullHouse(Card[] hand) {
        return hasThreeOfAKind(hand) && hasPair(hand);
    }
}
Use code with caution.javapublic class PokerDealerApplication {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        Card[] hand = new Card[5];
        System.out.println("Dealt Hand:");
        for (int i = 0; i < hand.length; i++) {
            hand[i] = myDeckOfCards.dealCard();
            System.out.println(hand[i]);
        }
        System.out.println("\nHand Evaluation:");
        if (myDeckOfCards.hasFourOfAKind(hand)) System.out.println("Four of a Kind!");
        else if (myDeckOfCards.hasFullHouse(hand)) System.out.println("Full House!");
        else if (myDeckOfCards.hasFlush(hand)) System.out.println("Flush!");
        else if (myDeckOfCards.hasStraight(hand)) System.out.println("Straight!");
        else if (myDeckOfCards.hasThreeOfAKind(hand)) System.out.println("Three of a Kind!");
        else if (myDeckOfCards.hasTwoPairs(hand)) System.out.println("Two Pairs!");
        else if (myDeckOfCards.hasPair(hand)) System.out.println("One Pair!");
        else System.out.println("High Card.");
    }
}

Use code with caution.3javapublic class DealerSimulationPoker {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] playerHand = new Card[5];
        Card[] dealerHand = new Card[5];

        for (int i = 0; i < 5; i++) {
            playerHand[i] = deck.dealCard();
            dealerHand[i] = deck.dealCard();
        }

        System.out.println("Your Hand:");
        for (Card c : playerHand) System.out.println("  " + c);

        System.out.println("\nDealer is evaluating and drawing cards...");
        if (!deck.hasFlush(dealerHand) && !deck.hasStraight(dealerHand) && !deck.hasFullHouse(dealerHand) && !deck.hasFourOfAKind(dealerHand)) {
            if (deck.hasThreeOfAKind(dealerHand) || deck.hasTwoPairs(dealerHand) || deck.hasPair(dealerHand)) {
                dealerHand[3] = deck.dealCard();
                dealerHand[4] = deck.dealCard();
            } else {
                dealerHand[2] = deck.dealCard();
                dealerHand[3] = deck.dealCard();
                dealerHand[4] = deck.dealCard();
            }
        }

        int playerScore = TwoHandPoker.evaluateHand(deck, playerHand);
        int dealerScore = TwoHandPoker.evaluateHand(deck, dealerHand);

        System.out.println();
        if (playerScore > dealerScore) System.out.println("You win!");
        else if (dealerScore > playerScore) System.out.println("Dealer wins!");
        else System.out.println("It's a tie!");
    }
}
Use code with caution.4javaimport java.util.Scanner;

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
Use code with caution.7.20