package controller;

import view.ViewFactory;

public abstract class Controller {
    protected ViewFactory viewFactory;

    public Controller(ViewFactory viewFactory) {
        this.viewFactory = viewFactory;
    }
}
