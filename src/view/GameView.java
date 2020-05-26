package view;

import memoryGame.Card;
import memoryGame.DifficultLevel;
import controller.GameController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameView extends View {
    public  static int ROWS;
    public static int COLUMNS;
    public static final int MENU_BAR_SIZE = 30;
    public static int FRAME_WIDTH;
    public static int FRAME_HEIGHT;
    private CardsPanel panel;
    private List<Card> cards;

    public GameView(String title, DifficultLevel difficultLevel) throws HeadlessException {
        super(title, 0,0);
        cards = new ArrayList<>();
        ROWS = difficultLevel.getRows();
        COLUMNS = difficultLevel.getColumns();
        setFrameSize();
        panel = new CardsPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(panel);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }

    public void setFrameSize() {
        FRAME_WIDTH = 2 * GameController.OFFSET + COLUMNS * Card.CARD_WIDTH + COLUMNS * GameController.OFFSET_BETWEEN;
        FRAME_HEIGHT = 2 * GameController.OFFSET + ROWS * Card.CARD_HEIGHT + ROWS * GameController.OFFSET_BETWEEN + MENU_BAR_SIZE;
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    protected ViewGraphicPanel buildPanel() {
        return new ViewGraphicPanelStandard();
    }

    private class CardsPanel extends  JPanel{
        protected void paintComponent(Graphics g) {
            g.clearRect(0,0, GameView.FRAME_WIDTH, GameView.FRAME_HEIGHT);
            for (Card card : cards) {
                card.paint(g);
            }
        }
    }




/*    public GameFrame() throws HeadlessException {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Memory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(gameEngine);
        setVisible(true);
    }*/
}

//rozmiar dostosowany do ilości kart

//menu przy uruchomieniu gry -> na koniec
