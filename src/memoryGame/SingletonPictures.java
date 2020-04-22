package memoryGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Set;

//SINGLETON PATTERN
public class SingletonPictures {
    private static BufferedImage reverse;
    private static BufferedImage matchedPicture;
    private static BufferedImage pictureBackground;
    private static BufferedImage menuBackground;
    private static Set<Picture> allPictures;


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

    public static BufferedImage getPictureBackground() {
        if (pictureBackground == null) {
            pictureBackground = PicturesLoader.getImage(new File("resources/reverse.jpg"));
        }
        return pictureBackground;
    }

    public static BufferedImage getMenuBackground() {
        if (menuBackground == null) {
            menuBackground = PicturesLoader.getImage(new File("resources/Main_Menu.jpg"));
        }
        return menuBackground;
    }

    public static Set<Picture> getAllPictures() {
        if (allPictures == null) {
            allPictures = PicturesLoader.loadPictures();
        }
        return allPictures;
    }

}
