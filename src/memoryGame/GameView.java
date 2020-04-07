package memoryGame;

import view.View;

import javax.swing.*;
import java.awt.*;

public class GameView extends View {
    public  static int ROWS;
    public static int COLUMNS;
    public static final int MENU_BAR_SIZE = 30;
    public static int FRAME_WIDTH;
    public static int FRAME_HEIGHT;
    private GameEngine gameEngine;

    public GameView(String title, DifficultLevel difficultLevel) throws HeadlessException {
        super(title, 0,0);
        ROWS = difficultLevel.getRows();
        COLUMNS = difficultLevel.getColumns();
        setFrameSize();
        gameEngine = new GameEngine();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(gameEngine);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);
    }

    public void setFrameSize() {
        FRAME_WIDTH = 2 * GameEngine.OFFSET + COLUMNS * Card.CARD_WIDTH + COLUMNS * GameEngine.OFFSET_BETWEEN;
        FRAME_HEIGHT = 2 * GameEngine.OFFSET + ROWS * Card.CARD_HEIGHT + ROWS * GameEngine.OFFSET_BETWEEN + MENU_BAR_SIZE;
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
