import memoryGame.GameFrame;
import view.ViewFactory;
import view.ViewType;

import java.awt.*;

public class Launcher {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewFactory viewFactory = new ViewFactory();
                viewFactory.buildView(ViewType.MENU);
            }
        });

    }

}

