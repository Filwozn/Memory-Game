package memoryGame;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {

    private List<Picture> cardPictures;

    public CardFactory() {
        PicturesGenerator generator = new PicturesGenerator();
        cardPictures = generator.generateRandomPictures();
    }

    public List<Card> buildFullBoard() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < Game.ROWS; i++) {
            cards.addAll(buildRandomRow(Game.COLUMNS, i));
        }
        return cards;
    }

    private List<Card> buildRandomRow(int amount, int rowIndex) {
        List<Card> cards = new ArrayList<>();
        for (int column = 0; column < amount; column++) {
            cards.add(new Card(cardPictures.get(column + rowIndex *amount), column, rowIndex));
        }
        return cards;

    }
}
