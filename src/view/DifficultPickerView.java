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
}
