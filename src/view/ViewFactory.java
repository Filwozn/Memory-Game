package view;

import controller.DifficultPickerController;
import controller.MenuViewController;
import memoryGame.GameView;

public class ViewFactory {
    public void buildView(ViewType viewType){

        switch (viewType){

            case MENU:
                MenuView menuView = new MenuView("Menu");
                MenuViewController menuViewController = new MenuViewController(this,menuView);
                return;
            case GAME:
                GameView gameView = new GameView("Memory");
                return;
            case HIGH_SCORES:
                break;
            case DIFFICULT_PICKER:
                DifficultPickerView difficultPickerView = new DifficultPickerView("Difficult Picker");
                DifficultPickerController difficultPickerController = new DifficultPickerController(this,difficultPickerView);
                return;
        }
    }
}
