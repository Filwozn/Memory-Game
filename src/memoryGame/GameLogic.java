package memoryGame;

import java.util.List;

public class GameLogic {

    private List<Card> cards;

    public GameLogic(List<Card> cards) {
        this.cards = cards;
    }

    public void executeSelection(int x, int y) {
        Card cardSelected = null;
        for (Card card : cards) {
               if(card.getX() == x && card.getY() == y){
                   cardSelected = card;
                   break;
               }
        }

    }

}
