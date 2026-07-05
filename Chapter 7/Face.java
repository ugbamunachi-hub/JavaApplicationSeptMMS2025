//7.20java
public enum Face { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }
Use code with caution.javapublic enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES }
Use code with caution.javapublic class EnumCard {
    private final Face face;
    private final Suit suit;
    public EnumCard(Face cardFace, Suit cardSuit) { this.face = cardFace; this.suit = cardSuit; }
    public Face getFace() { return face; }
    public Suit getSuit() { return suit; }
    public String toString() { return face + " of " + suit; }
}
import java.security.SecureRandom;

public class EnumDeck {
    private EnumCard[] deck;
    private int currentCard;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public EnumDeck() {
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();
        deck = new EnumCard[52];
        currentCard = 0;
        int index = 0;
        for (Suit suit : suits) {
            for (Face face : faces) { deck[index++] = new EnumCard(face, suit); }
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(52);
            EnumCard temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public EnumCard dealCard() { return currentCard < deck.length ? deck[currentCard++] : null; }
}
