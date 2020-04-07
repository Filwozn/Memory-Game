package controller;

import memoryGame.DifficultLevel;
import memoryGame.GameView;
import view.DifficultPickerView;
import view.ViewFactory;
import view.ViewType;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultPickerController extends Controller {
    private DifficultPickerView difficultPickerView;

    public DifficultPickerController(ViewFactory viewFactory, DifficultPickerView difficultPickerView) {
        super(viewFactory);
        this.difficultPickerView = difficultPickerView;
        setupButtonsAction();
    }

    public void setupButtonsAction(){
        difficultPickerView.addEasyButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                easyAction();
            }
        });
        difficultPickerView.addMediumButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediumAction();
            }
        });
        difficultPickerView.addHardButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               hardAction();
            }
        });
        difficultPickerView.addBackButtonAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               backAction();
            }
        });
    }
    public void easyAction(){
        difficultPickerView.dispose();
        viewFactory.buildGameView(DifficultLevel.EASY);
    }
    public void mediumAction(){
             difficultPickerView.dispose();
        viewFactory.buildGameView(DifficultLevel.MEDIUM);
    }
    public void hardAction(){
        difficultPickerView.dispose();
        viewFactory.buildGameView(DifficultLevel.HARD);
    }
    public void backAction(){
        viewFactory.buildView(ViewType.MENU);
        difficultPickerView.dispose();
    }

}
