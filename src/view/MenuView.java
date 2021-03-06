package view;

import audio.MusicPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadPoolExecutor;

public class MenuView extends View {
    private JButton start;
    private JButton highScores;
    private JButton exit;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;


    public MenuView(String title) throws HeadlessException {
        super(title, WIDTH, HEIGHT);
        setupFrame();
        setupComponents();
        setVisible(true);

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
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN*7)));
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

    @Override
    protected ViewGraphicPanel buildPanel() {
        return new ViewGraphicPanelStandard();
    }

}
