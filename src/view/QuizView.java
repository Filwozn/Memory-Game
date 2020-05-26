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
    private static final int FIRST_BUTTON_Y = 60;
    private static final int BUTTON_SPACE_Y = 40;
    private static final int BUTTONS_X = 450;
    private static final int LABEL_ANSWER_MOVE = 50;
    private JLabel question;
    private List<JLabel> textAnswers;
    private List<JButton> buttons;

    private ViewGraphicPanelQuiz quizPanel;

    public QuizView(String title) throws HeadlessException {
        super(title, WIDTH, HEIGHT);
        setupFrame();
        setupComponents();
        setVisible(true);
    }

    public void setupFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public void setupComponents() {
        question = new JLabel("<html>Jaką nazwę nosi ten obraz i kto go namalował?</html>");
        Font currentFont = question.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.6F);
        question.setFont(newFont);
        prepareAllAnswersLabels();
        arrangeAllAnswersLabels();
        prepareAllButtons();
        arrangeAllButtons();
        question.setBounds(440,5,340,50);
        myPanel.add(question);
    }

    private void prepareAllAnswersLabels() {
        textAnswers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            JLabel answer = new JLabel("");
            textAnswers.add(answer);
            myPanel.add(answer);
        }
    }
    private void arrangeAllAnswersLabels(){
        for (int i = 0; i < textAnswers.size() ; i++) {
            JLabel label = textAnswers.get(i);
            Dimension preferredSize = label.getPreferredSize();
            label.setBounds(BUTTONS_X+LABEL_ANSWER_MOVE, FIRST_BUTTON_Y + BUTTON_SPACE_Y*i,280,28);
        }
    }

    private void prepareAllButtons() {
        buttons = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            JButton button = new JButton(String.valueOf("ABCD".charAt(i)));
            myPanel.add(button);
            buttons.add(button);
        }
    }

    private void arrangeAllButtons(){
        for (int i = 0; i < buttons.size() ; i++) {
            JButton button = buttons.get(i);
            Dimension preferredSize = button.getPreferredSize();
            button.setBounds(BUTTONS_X, FIRST_BUTTON_Y + BUTTON_SPACE_Y*i,preferredSize.width,preferredSize.height);
        }
    }

    public void addButtonAction(ActionListener actionListener) {
        for (JButton button : buttons) {
            button.addActionListener(actionListener);
        }
    }

    public void addAllAnswers(List<String> answers) {
        for (int i = 0; i < answers.size(); i++) {
            textAnswers.get(i).setText("<html>" + answers.get(i) + "</html>");
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
