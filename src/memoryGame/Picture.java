package memoryGame;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Picture {
    private String author;
    private String title;
    private BufferedImage image;

    public Picture(String author, String title, BufferedImage image) {
        this.author = author;
        this.title = title;
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return Objects.equals(author, picture.author) &&
                Objects.equals(title, picture.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Picture{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'';
    }

    public Image getImage() {
        return image;
    }
}
