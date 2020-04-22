package view;

import java.awt.image.BufferedImage;

public class PanelImage {
    private BufferedImage image;
    private int x;
    private int y;
    private int width;
    private int high;

    public PanelImage(BufferedImage image, int x, int y, int width, int high) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.high = high;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHigh() {
        return high;
    }
}
