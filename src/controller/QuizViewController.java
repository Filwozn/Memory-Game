package controller;

import model.QuizService;
import view.QuizView;
import view.AppFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizViewController extends Controller {
    private QuizView quizView;
    private QuizService quizService;

    public QuizViewController(AppFactory appFactory, QuizView quizView, QuizService quizService) {
        super(appFactory);
        this.quizService = quizService;
        quizView.setCorrectPicture(quizService.getCorrectAnswer());
    }

    public void setupButtonsAction() {
        quizView.addButtonAAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAAction();
            }
        });
        quizView.addButtonBAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBAction();
            }
        });
        quizView.addButtonCAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonCAction();
            }
        });
        quizView.addButtonDAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDAction();
            }
        });
    }

    public void buttonAAction() {

    }

    public void buttonBAction() {

    }

    public void buttonCAction() {

    }

    public void buttonDAction() {

    }
}
