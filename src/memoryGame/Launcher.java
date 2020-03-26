package memoryGame;

import java.awt.*;

public class Launcher {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameFrame gameFrame = new GameFrame();
            }
        });

    }
}
