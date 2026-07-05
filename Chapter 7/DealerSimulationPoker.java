//3java
public class DealerSimulationPoker {
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

