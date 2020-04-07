package view;

import memoryGame.PicturesLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

//MVC PATTERN
public abstract class View extends JFrame {
    protected MyPanel myPanel;
    public static final int MARGIN = 10;
    private int width;
    private int height;
    public View(String title, int width, int height) throws HeadlessException {
        super(title);
        this.width = width;
        this.height = height;
        setupBaseFrame();
        setupPanel();
    }
    public void setupBaseFrame() {
        setSize(width,height);
        setLocationRelativeTo(null);
        setResizable(false);
        // pack();
    }

    private void setupPanel() {
        myPanel = new MyPanel();
        add(myPanel);
    }
    public class MyPanel extends JPanel {
        private BufferedImage background;
        public MyPanel() {
            background = PicturesLoader.getImage(new File("resources/Main_Menu.jpg"));
            setupComponent();
        }

        public void setupComponent() {
            BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
            setLayout(boxLayout);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(background,0,0,MenuView.WIDTH,MenuView.HEIGHT,null);
        }
    }
}
