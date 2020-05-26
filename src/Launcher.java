import audio.MusicPlayer;
import view.AppFactory;

import java.awt.*;

public class Launcher {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                AppFactory appFactory = new AppFactory();
                appFactory.buildMenu();
            }
        });
 
    }

}

