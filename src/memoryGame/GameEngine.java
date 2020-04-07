package memoryGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameEngine extends JPanel implements CardObserver{
    public static final int OFFSET = 15;
    public static final int OFFSET_BETWEEN = 15;
    private List<Card> cards = new ArrayList<>();
    private GameLogic logic;

    public GameEngine() {
        CardFactory factory = new CardFactory();
        cards.addAll(factory.buildFullBoard());
        logic = new GameLogic(cards);
        logic.setObserver(this);
        MouseManager mouseManager = new MouseManager(this);
        addMouseListener(mouseManager);
    }

    public void click(int x, int y) {
        logic.executeSelection(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0,0, GameView.FRAME_WIDTH, GameView.FRAME_HEIGHT);
        for (Card card : cards) {
            card.paint(g);
        }
    }


    @Override
    public void cardStateChanged() {
        repaint();
    }
}
