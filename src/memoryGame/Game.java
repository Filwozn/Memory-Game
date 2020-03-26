package memoryGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game extends JPanel {
    public static final int OFFSET = 15;
    public static final int OFFSET_BETWEEN = 15;
    private List<Card> cards = new ArrayList<>();
    private CardFactory factory = new CardFactory();
    private MouseManager mouseManager = new MouseManager(this);

    public Game() {
        cards.addAll(factory.buildFullBoard());
        addMouseListener(mouseManager);
    }
    public void click (int x, int y){
        System.out.println("x = " + x + " y = " + y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Card card : cards) {
            card.paint(g);
        }
    }
}
