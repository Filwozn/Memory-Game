package view;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public abstract class ViewGraphicPanel extends JPanel {
    protected List<PanelImage> images = new ArrayList<>();
    private BufferedImage backgroundImage;

    public ViewGraphicPanel(BufferedImage backgroundImage) {
        this.backgroundImage = backgroundImage;
        addBackgroundImage();
       setupComponent();
    }


    protected void addBackgroundImage() {
        PanelImage background = new PanelImage(backgroundImage,0,0, MenuView.WIDTH,MenuView.HEIGHT);
        images.add(background);
    }

    public void setupComponent() {
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(boxLayout);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (PanelImage image : images) {
            g.drawImage(image.getImage(),image.getX(),image.getY(),image.getWidth(),image.getHigh(),null);
        }
    }




}
