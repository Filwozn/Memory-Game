package memoryGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel {
    public static final int OFFSET = 15;
    public static final int OFFSET_BETWEEN = 15;
    private List<Card> cards = new ArrayList<>();
    private CardFactory factory = new CardFactory();

    public Board() {
        cards.addAll(factory.buildFullBoard());
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Card card : cards) {
            card.paint(g);
        }
    }
}
