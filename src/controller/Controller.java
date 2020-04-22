package controller;

import view.AppFactory;

public abstract class Controller {
    protected AppFactory appFactory;

    public Controller(AppFactory appFactory) {
        this.appFactory = appFactory;
    }
}
