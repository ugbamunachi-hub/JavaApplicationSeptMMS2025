//.2java
public class TwoHandPoker {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];

        for (int i = 0; i < 5; i++) {
            hand1[i] = deck.dealCard();
            hand2[i] = deck.dealCard();
        }

        System.out.println("Hand 1:");
        for (Card c : hand1) System.out.println("  " + c);
        int score1 = evaluateHand(deck, hand1);

        System.out.println("\nHand 2:");
        for (Card c : hand2) System.out.println("  " + c);
        int score2 = evaluateHand(deck, hand2);

        System.out.println();
        if (score1 > score2) System.out.println("Hand 1 wins!");
        else if (score2 > score1) System.out.println("Hand 2 wins!");
        else System.out.println("It's a tie based on ranking category!");
    }

    public static int evaluateHand(DeckOfCards deck, Card[] hand) {
        if (deck.hasFourOfAKind(hand)) { System.out.println("Rank: Four of a Kind"); return 7; }
        if (deck.hasFullHouse(hand)) { System.out.println("Rank: Full House"); return 6; }
        if (deck.hasFlush(hand)) { System.out.println("Rank: Flush"); return 5; }
        if (deck.hasStraight(hand)) { System.out.println("Rank: Straight"); return 4; }
        if (deck.hasThreeOfAKind(hand)) { System.out.println("Rank: Three of a Kind"); return 3; }
        if (deck.hasTwoPairs(hand)) { System.out.println("Rank: Two Pairs"); return 2; }
        if (deck.hasPair(hand)) { System.out.println("Rank: One Pair"); return 1; }
        System.out.println("Rank: High Card"); return 0;
    }
}