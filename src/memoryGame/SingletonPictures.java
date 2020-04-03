package memoryGame;

import java.awt.image.BufferedImage;
import java.io.File;

//SINGLETON PATTERN
public class SingletonPictures {
    private static BufferedImage reverse;
    private static BufferedImage matchedPicture;

    public static BufferedImage getRevers() {
        if (reverse == null) {
            reverse = PicturesLoader.getImage(new File("resources/reverse.jpg"));
        }
        return reverse;
    }

    public static BufferedImage getMatchedPicture() {
        if (matchedPicture == null) {
            matchedPicture = PicturesLoader.getImage(new File("resources/Canvas.jpg"));
        }
        return matchedPicture;
    }


}
