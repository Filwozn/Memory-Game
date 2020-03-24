package memoryGame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class PicturesLoader {
    private static final String PICTURES_FOLDER = "resources/images";

    public Set<Picture> loadPictures() {
        Set<Picture> pictures = new HashSet<>();
        File folder = new File(PICTURES_FOLDER);
        File[] filePictures = folder.listFiles();
        for (File filePicture : filePictures) {
            Picture picture = loadPicture(filePicture);
            pictures.add(picture);
        }
        return pictures;
    }

    private Picture loadPicture(File file) {
        BufferedImage image = getImage(file);
        String fileName = file.getName();
        String name = fileName.split(".jpg")[0];
        String[] authorAndTitle = name.split(" - ");
        String author = authorAndTitle[0];
        String title = authorAndTitle[1];
        return new Picture(author,title,image);
    }

    private BufferedImage getImage(File file) {
        try {
            return ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}

