package memoryGame;

import controller.GameController;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Card {

    public static final int CARD_WIDTH = 100;
    public static final int CARD_HEIGHT = 162;
    private BufferedImage reverse;
    private BufferedImage matchedPicture;
    private Picture hiddenPicture;
    private int x;
    private int y;
    private CardState state = CardState.REVERSE;

    public Card(Picture hiddenPicture, int x, int y) {
        this.hiddenPicture = hiddenPicture;
        this.x = x;
        this.y = y;
        reverse = SingletonPictures.getRevers();
        matchedPicture = SingletonPictures.getMatchedPicture();
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Card{" +
                "picture=" + hiddenPicture +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean hasSamePicture(Card secondCard) {
        return hiddenPicture.equals(secondCard.hiddenPicture);
    }

    public int getY() {
        return y;
    }

    public CardState getState() {
        return state;
    }

    public Picture getHiddenPicture() {
        return hiddenPicture;
    }

    public void paint(Graphics g) {
        Image actualImage;
        switch (state) {
            case FACE_UP:
                actualImage = hiddenPicture.getImage();
                break;
            default:
            case REVERSE:
                actualImage = reverse;
                break;
            case MATCHED:
                actualImage = matchedPicture;
                break;
        }


        g.drawImage(actualImage, x * CARD_WIDTH + GameController.OFFSET + GameController.OFFSET_BETWEEN * x,
                y * CARD_HEIGHT + GameController.OFFSET + GameController.OFFSET_BETWEEN * y, CARD_WIDTH, CARD_HEIGHT, null);
    }

    public void setState(CardState state) {
        this.state = state;
    }
}
