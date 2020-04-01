package view;

import javax.swing.*;
import java.awt.*;

public class MenuView extends View {
    private JButton start;
    private JButton highScores;
    private JButton exit;

    public MenuView(String title) throws HeadlessException {
        super(title);
    }
}
