package memoryGame;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {
    public List<Card> buildFullBoard() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < Game.ROWS; i++) {
            cards.addAll(buildRandomRow(Game.COLUMNS, i));
        }
        return cards;
    }

    private List<Card> buildRandomRow(int amount, int rowIndex) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cards.add(new Card(CardType.SQUARE, i, rowIndex));
        }
        return cards;

    }
}
