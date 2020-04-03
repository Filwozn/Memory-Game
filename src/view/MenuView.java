package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuView extends View {
    private JButton start;
    private JButton highScores;
    private JButton exit;
    private static final int MARGIN = 10;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public MenuView(String title) throws HeadlessException {
        super(title, WIDTH, HEIGHT);
        setupFrame();
        setupComponents();
    }

    public void setupFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setupComponents(){//TODO usunąć powtórki w kodzie
        start = new JButton("Start");
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        highScores = new JButton("High Scores");
        highScores.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit = new JButton("Exit");
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(start);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(highScores);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(exit);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
    }

public void addStartAction(ActionListener actionListener){
        start.addActionListener(actionListener);
}
public void addHighScoresButtonAction(ActionListener actionListener){
        highScores.addActionListener(actionListener);
}
public void addExitButtonAction(ActionListener actionListener){
        exit.addActionListener(actionListener);
}

}
