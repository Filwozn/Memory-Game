package memoryGame;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public static final int ROWS = 5;
    public static final int COLUMNS = 4;
    public static final int MENU_BAR_SIZE = 30;
    public static int width = 2*Board.OFFSET+ COLUMNS *Card.CARD_WIDTH+ COLUMNS *Board.OFFSET_BETWEEN;
    public static int height = 2*Board.OFFSET+ ROWS *Card.CARD_HEIGHT+ ROWS *Board.OFFSET_BETWEEN+MENU_BAR_SIZE;
    private Board panel = new Board();
    public Game() throws HeadlessException {
        setSize(width, height);
        setTitle("Memory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(panel);
        setVisible(true);
    }
}

//rozmiar dostosowany do ilości kart


//menu przy uruchomieniu gry -> na koniec
