package view;

import memoryGame.Picture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QuizView extends View {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JLabel question;
    private List<JLabel> textAnswers;

    private ViewGraphicPanelQuiz quizPanel;

    public QuizView(String title) throws HeadlessException {
        super(title, WIDTH, HEIGHT);
        setupFrame();
        setupComponents();
        setVisible(true);
    }

    public void setupFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setupPictureBackground() {

    }

    public void setupComponents() {
        question = new JLabel("Jaką nazwę nosi ten obraz \n" +
                " i kto go namalował?");
        question.setAlignmentX(Component.CENTER_ALIGNMENT);
        Font currentFont = question.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 2.1F);
        question.setFont(newFont);
        prepareAllAnswersLabels();


        buttonA = new JButton("A");
        buttonA.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonB = new JButton("B");
        buttonB.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonC = new JButton("C");
        buttonC.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonD = new JButton("D");
        buttonD.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(question);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(buttonA);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(buttonB);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(buttonC);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
        myPanel.add(buttonD);
        myPanel.add(Box.createRigidArea(new Dimension(0, MARGIN)));
    }

    private void prepareAllAnswersLabels() {
        textAnswers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            JLabel answer = new JLabel(String.valueOf("ABCD".charAt(i)));
            answer.setAlignmentX(Component.CENTER_ALIGNMENT);
            textAnswers.add(answer);
            myPanel.add(answer);
        }
    }

    public void addButtonAAction(ActionListener actionListener) {
        buttonA.addActionListener(actionListener);
    }

    public void addButtonBAction(ActionListener actionListener) {
        buttonB.addActionListener(actionListener);
    }

    public void addButtonCAction(ActionListener actionListener) {
        buttonC.addActionListener(actionListener);
    }

    public void addButtonDAction(ActionListener actionListener) {
        buttonC.addActionListener(actionListener);
    }

    public void addAllAnswers(List<String> answers) {
        for (int i = 0; i < answers.size(); i++) {
            textAnswers.get(i).setText(answers.get(i));
        }
    }
    public void setCorrectPicture(Picture correctPicture) {
        quizPanel.addCorrectPicture(correctPicture);
    }


    @Override
    protected ViewGraphicPanel buildPanel() {
        quizPanel = new ViewGraphicPanelQuiz();
        return quizPanel;
    }
}
