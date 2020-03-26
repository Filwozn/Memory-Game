package memoryGame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public static final int ROWS = 5;
    public static final int COLUMNS = 6;
    public static final int MENU_BAR_SIZE = 30;
    public static int width = 2* Game.OFFSET+ COLUMNS *Card.CARD_WIDTH+ COLUMNS * Game.OFFSET_BETWEEN;
    public static int height = 2* Game.OFFSET+ ROWS *Card.CARD_HEIGHT+ ROWS * Game.OFFSET_BETWEEN+MENU_BAR_SIZE;
    private Game game = new Game();
    public GameFrame() throws HeadlessException {
        setSize(width, height);
        setTitle("Memory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(game);
        setVisible(true);
    }
}

//rozmiar dostosowany do ilości kart

//menu przy uruchomieniu gry -> na koniec
