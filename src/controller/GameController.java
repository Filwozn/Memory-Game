package controller;

import controller.Controller;
import memoryGame.*;
import model.QuizService;
import view.GameView;
import view.AppFactory;

import java.util.List;
import java.util.Set;

public class GameController extends Controller implements CardObserver {
    public static final int OFFSET = 15;
    public static final int OFFSET_BETWEEN = 15;
    private List<Card> cards;
    private GameLogic logic;
    private CardFactory factory;
    private GameView gameView;


    public GameController(AppFactory appFactory, GameView gameView) {
        super(appFactory);
        this.gameView = gameView;
        factory = new CardFactory();
        cards = gameView.getCards();
        cards.addAll(factory.buildFullBoard());
        logic = new GameLogic(cards);
        logic.setObserver(this);
        MouseManager mouseManager = new MouseManager(this);
        gameView.addMouseListener(mouseManager);
        gameView.setVisible(true);
    }

    public void click(int x, int y) {
        logic.executeSelection(x, y);
    }

    @Override
    public void cardStateChanged() {
        gameView.repaint();
    }

    public void triggerQuiz(Picture matched) {
        Set<Picture> all = SingletonPictures.getAllPictures();
        QuizService quizService = new QuizService(matched, all);
        appFactory.buildQuizView(quizService);
    }
}
