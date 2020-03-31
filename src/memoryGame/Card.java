package memoryGame;

import java.awt.*;

public class Card {

    public static final int CARD_WIDTH = 100;
    public static final int CARD_HEIGHT = 162;


    private Picture picture;
    private int x;
    private int y;

    public Card(Picture picture, int x, int y) {
        this.picture = picture;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Card{" +
                "picture=" + picture +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics g) {
        g.drawImage(picture.getImage(), x * CARD_WIDTH + GameEngine.OFFSET + GameEngine.OFFSET_BETWEEN * x,
                y * CARD_HEIGHT + GameEngine.OFFSET + GameEngine.OFFSET_BETWEEN * y, CARD_WIDTH, CARD_HEIGHT, null);
    }
}
