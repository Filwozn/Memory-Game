package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DifficultPickerView extends View{
    private JButton easy;
    private JButton medium;
    private JButton hard;
    private JButton back;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public DifficultPickerView(String title) throws HeadlessException {
        super(title, WIDTH, HEIGHT);
        setupComponents();
        setupFrame();
        setVisible(true);
    }

    public void setupFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addEasyButtonAction(ActionListener actionListener){
        easy.addActionListener(actionListener);
    }
    public void addMediumButtonAction(ActionListener actionListener){
        medium.addActionListener(actionListener);
    }
    public void addHardButtonAction(ActionListener actionListener){
        hard.addActionListener(actionListener);
    }
    public void addBackButtonAction(ActionListener actionListener){
        back.addActionListener(actionListener);
    }

    public void setupComponents(){
        easy = new JButton("Easy");
        easy.setAlignmentX(Component.CENTER_ALIGNMENT);
        medium = new JButton(" Medium");
        medium.setAlignmentX(Component.CENTER_ALIGNMENT);
        hard = new JButton("Hard");
        hard.setAlignmentX(Component.CENTER_ALIGNMENT);
        back = new JButton("Back");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(easy);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(medium);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(hard);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(back);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
    }

    @Override
    protected ViewGraphicPanel buildPanel() {
        return new ViewGraphicPanelStandard();
    }
}
