package memoryGame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GameLogic {

    private List<Card> cards;
    private List<Card> selectedCards = new ArrayList<>();
    private CardObserver observer;


    public GameLogic(List<Card> cards) {
        this.cards = cards;
    }

    //zlecam prace na osobnym watku, którego będę zatrzywał na 1 sekundę  aby user mogl zobaczyć kartę
    //gdybym robił to na głównym wątku zatrzymałbym całą aplikacje - równiez uaktualnie wygladu kart
    public void executeSelection(int x, int y) {
        runOnOtherThreat(x, y);
    }

    public void runOnOtherThreat(int x, int y) {
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                onSelection(x, y);
                return null;
            }
        };
        worker.execute();
    }

    private void onSelection(int x, int y) {
        Card card = findCardByCords(x, y);
        if (canBeSelected(card)) {
            addSelectedCard(card);
            compareSelectedCards();
        }
    }

    public Card findCardByCords(int x, int y) {
        for (Card card : cards) {
            if (card.getX() == x && card.getY() == y) {
                return card;
            }
        }
        throw new IllegalStateException("Nie znaleziono karty");
    }


    public void addSelectedCard(Card card) {
        selectedCards.add(card);
        changeCardState(card, CardState.FACE_UP);
    }

    public boolean canBeSelected(Card card) {
        return card.getState() == CardState.REVERSE && selectedCards.size() < 2;
    }

    public void compareSelectedCards() {
        if (selectedCards.size() < 2) {
            return;
        }
        cooldown();
        if (selectedCards.get(0).hasSamePicture(selectedCards.get(1))) {
            for (Card selectedCard : selectedCards) {
                changeCardState(selectedCard, CardState.MATCHED);
            }
        } else {
            for (Card selectedCard : selectedCards) {
                changeCardState(selectedCard, CardState.REVERSE);
            }
        }
        selectedCards.clear();
    }

    private void changeCardState(Card card, CardState state) {
        card.setState(state);
        observer.cardStateChanged();
    }

    private void cooldown() {
        try {
            Thread.sleep(2000); //1 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void setObserver(CardObserver observer) {
        this.observer = observer;
    }
}


