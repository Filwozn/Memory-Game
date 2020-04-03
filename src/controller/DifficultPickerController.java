package controller;

import view.DifficultPickerView;
import view.ViewFactory;

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
        System.out.println("EAsy");

    }
    public void mediumAction(){
        System.out.println("medium");
    }
    public void hardAction(){
        System.out.println("Hard");
    }
    public void backAction(){
        System.out.println("Cofnij");
    }
}
