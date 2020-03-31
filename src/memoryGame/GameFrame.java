package memoryGame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public static final int ROWS = 2; //max 5
    public static final int COLUMNS = 2;
    public static final int MENU_BAR_SIZE = 30;
    public static int FRAME_WIDTH = 2 * GameEngine.OFFSET + COLUMNS * Card.CARD_WIDTH + COLUMNS * GameEngine.OFFSET_BETWEEN;
    public static int FRAME_HEIGHT = 2 * GameEngine.OFFSET + ROWS * Card.CARD_HEIGHT + ROWS * GameEngine.OFFSET_BETWEEN + MENU_BAR_SIZE;
    private GameEngine gameEngine = new GameEngine();

    public GameFrame() throws HeadlessException {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Memory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(gameEngine);
        setVisible(true);
    }
}

//rozmiar dostosowany do ilości kart

//menu przy uruchomieniu gry -> na koniec
