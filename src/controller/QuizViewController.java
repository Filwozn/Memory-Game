package controller;

import model.QuizService;
import view.QuizView;
import view.AppFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class QuizViewController extends Controller {
    private QuizView quizView;
    private QuizService quizService;

    public QuizViewController(AppFactory appFactory, QuizView quizView, QuizService quizService) {
        super(appFactory);
        this.quizService = quizService;
        this.quizView = quizView;
        quizView.setCorrectPicture(quizService.getCorrectAnswer());
        setupAnswers();
        setupButtonsAction();
    }

    public void setupButtonsAction() {
        quizView.addButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String selectedAnswer = button.getText();
                buttonAction(selectedAnswer);
            }
        });
    }

    public void setupAnswers() {
        List<String> allAnswers = quizService.getAllAnswersStrings();
        quizView.addAllAnswers(allAnswers);
    }

    public void buttonAction(String selectedAnswer) {
       if(quizService.isAnswerCorrect(selectedAnswer)){
           JOptionPane.showMessageDialog(quizView,"Poprawna odpowiedź");
       }else {
           JOptionPane.showMessageDialog(quizView,"Niepoprawna odpowiedź " + quizService.getCorrectAnswerMessage());
       }
       quizView.dispose();
    }

//quizService.getCorrectAnswerMessage()
}
