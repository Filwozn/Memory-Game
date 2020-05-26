package memoryGame;

import view.GameView;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {

    private List<Picture> cardPictures;

    public CardFactory() {
        CardPicturesGenerator generator = new CardPicturesGenerator();
        cardPictures = generator.generateRandomPictures();
    }

    public List<Card> buildFullBoard() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < GameView.ROWS; i++) {
            cards.addAll(buildRandomRow(GameView.COLUMNS, i));
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

    public List<Picture> getCardPictures() {
      return new ArrayList<>(cardPictures);
    }
}
