package memoryGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

    // Stare dzialanie rysowania karty
//    public void paint(Graphics g){
//        g.drawRect(x*CARD_WIDTH+Board.OFFSET+Board.OFFSET_BETWEEN*x,
//                y*CARD_HEIGHT+Board.OFFSET+Board.OFFSET_BETWEEN*y,CARD_WIDTH,CARD_HEIGHT);
//    }
    //Rysowanie obrazu
    public void paint(Graphics g) {
        g.drawImage(picture.getImage(), x * CARD_WIDTH + Board.OFFSET + Board.OFFSET_BETWEEN * x,
                y * CARD_HEIGHT + Board.OFFSET + Board.OFFSET_BETWEEN * y, CARD_WIDTH, CARD_HEIGHT, null);
    }
}
