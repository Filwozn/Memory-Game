package view;

import controller.MenuViewController;

public class ViewFactory {
    public void buildView(ViewType viewType){

        switch (viewType){

            case MENU:
                MenuView menuView = new MenuView("Menu");
                MenuViewController menuViewController = new MenuViewController(this,menuView);
                return;
            case GAME:
                break;
            case HIGH_SCORES:
                break;
            case DIFFICULT_PICKER:
                break;
        }
    }
}
