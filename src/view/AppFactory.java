package view;

import controller.Controller;
import controller.DifficultPickerViewController;
import controller.MenuViewController;
import controller.QuizViewController;
import memoryGame.DifficultLevel;
import controller.GameController;
import model.QuizService;

public class AppFactory {

    public void buildMenu(){
        MenuView menuView = new MenuView("Menu");
        MenuViewController menuViewController = new MenuViewController(this,menuView);
    }

    public void buildGame(DifficultLevel level) {
        GameView gameView = new GameView("Memory", level);
        Controller gameEngine = new GameController(this,gameView);
    }

    public void buildQuizView(QuizService quizService) {

        QuizView quizView = new QuizView("Quiz");
        QuizViewController quizViewController = new QuizViewController(this,quizView, quizService);

    }
    public void buildDifficultPicker(){
        DifficultPickerView difficultPickerView = new DifficultPickerView("Difficult Picker");
        DifficultPickerViewController difficultPickerViewController = new DifficultPickerViewController(this,difficultPickerView);
    }
}
