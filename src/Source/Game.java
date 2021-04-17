package Source;

import java.util.ArrayList;

public class Game {
    private int currentPrize;
    private String playerId;

    private Deck deck;
    private ArrayList<ArrayList<Card>> playerHand;
    private ArrayList<Card> discardPile;

    private Card.Color validColor;

    public Game() {

    }
}
