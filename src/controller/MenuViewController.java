package controller;

import view.MenuView;
import view.AppFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuViewController extends Controller{
    private MenuView menuView;
    public MenuViewController(AppFactory appFactory, MenuView menuView) {
        super(appFactory);
        this.menuView = menuView;
        setupButtonsAction();
    }
    public void setupButtonsAction(){
        menuView.addStartAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startAction();
            }
        });
        menuView.addHighScoresButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                highScoresAction();
            }
        });
        menuView.addExitButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitAction();
            }
        });
    }
    public void startAction(){
        appFactory.buildDifficultPicker();
        menuView.dispose();
    }
    public void highScoresAction(){
        System.out.println("HighScores");
    }
    public void exitAction(){
        System.exit(0);
    }
}
