package Source;

import javafx.scene.image.Image;

import java.util.Random;

public class Deck {

    private Card[] cards;
    private int cardsInDeck;

    public Deck() {
        cards = new Card[75];
    }

    public void reset() {
        Card.Color[] colors = Card.Color.values();
        cardsInDeck = 0;
        for (Card.Color clr : colors) {
            for (int j = 1; j <= 15; j++) {
                cards[cardsInDeck++] = new Card(clr, Card.Value.getValue(j));
            }
        }
    }

    public boolean isEmpty() {
        return cardsInDeck == 0;
    }

    public void shuffle() {
        int n = cards.length;
        Random random = new Random();

        for (int i = 0; i < cards.length; i++) {
            int randomValue = i + random.nextInt(n - i);
            Card randomCard = cards[randomValue];
            cards[randomValue] = cards[i];
            cards[i] = randomCard;
        }
    }

    public Card deal() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("The deck is empty.");
        }
        return cards[--cardsInDeck];
    }

    public Image dealCardImage() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("The deck is empty.");
        }
        return new Image(cards[cardsInDeck].toString() + ".png");
    }

}
