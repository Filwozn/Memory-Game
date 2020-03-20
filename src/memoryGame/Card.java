package memoryGame;

import java.awt.*;

public class Card {

    public static final int CARD_WIDTH = 100;
    public static final int CARD_HEIGHT = 162;


    private CardType type;
    private int x;
    private int y;

    public Card(CardType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g){
        g.drawRect(x*CARD_WIDTH+Board.OFFSET+Board.OFFSET_BETWEEN*x,
                y*CARD_HEIGHT+Board.OFFSET+Board.OFFSET_BETWEEN*y,CARD_WIDTH,CARD_HEIGHT);
    }
}
