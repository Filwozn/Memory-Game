package view;

import memoryGame.Picture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class QuizView extends View {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JLabel question;
    private JLabel answerA;
    private JLabel answerB;
    private JLabel answerC;
    private JLabel answerD;
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
        question = new JLabel("Jaki to obraz i kto jest autorem?");
        question.setAlignmentX(Component.CENTER_ALIGNMENT);
        answerA = new JLabel("A: ");
        answerA.setAlignmentX(Component.CENTER_ALIGNMENT);
        answerB = new JLabel("B: ");
        answerB.setAlignmentX(Component.CENTER_ALIGNMENT);
        answerC = new JLabel("C: ");
        answerC.setAlignmentX(Component.CENTER_ALIGNMENT);
        answerD = new JLabel("D: ");
        answerD.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonA = new JButton("A");
        buttonA.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonB = new JButton("B");
        buttonB.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonC = new JButton("C");
        buttonC.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonD = new JButton("D");
        buttonD.setAlignmentX(Component.CENTER_ALIGNMENT);
        myPanel.add(question);
        myPanel.add(answerA);
        myPanel.add(answerB);
        myPanel.add(answerC);
        myPanel.add(answerD);
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

    public void addAnswerA(String answer) {
        answerA.setText(answer);
    }

    public void addAnswerB(String answer) {
        answerA.setText(answer);
    }

    public void addAnswerC(String answer) {
        answerA.setText(answer);
    }

    public void addAnswerD(String answer) {
        answerA.setText(answer);
    }
    public void setCorrectPicture(Picture correctPicture){
        quizPanel.addCorrectPicture(correctPicture);
    }


    @Override
    protected ViewGraphicPanel buildPanel() {
        quizPanel = new ViewGraphicPanelQuiz();
        return quizPanel;
    }
}
