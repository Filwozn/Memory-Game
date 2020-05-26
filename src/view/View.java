package view;

import javax.swing.*;
import java.awt.*;

//MVC PATTERN
//BRIDGE PATTEN
public abstract class View extends JFrame {
    protected ViewGraphicPanel myPanel;
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
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        // pack();
    }

    protected abstract ViewGraphicPanel buildPanel();

    private void setupPanel() {
        myPanel = buildPanel();
        add(myPanel);
    }

}
