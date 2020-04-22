package controller;

import memoryGame.DifficultLevel;
import view.DifficultPickerView;
import view.AppFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultPickerViewController extends Controller {
    private DifficultPickerView difficultPickerView;

    public DifficultPickerViewController(AppFactory appFactory, DifficultPickerView difficultPickerView) {
        super(appFactory);
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
        appFactory.buildGame(DifficultLevel.EASY);
    }
    public void mediumAction(){
             difficultPickerView.dispose();
        appFactory.buildGame(DifficultLevel.MEDIUM);
    }
    public void hardAction(){
        difficultPickerView.dispose();
        appFactory.buildGame(DifficultLevel.HARD);
    }
    public void backAction(){
        appFactory.buildMenu();
        difficultPickerView.dispose();
    }

}
