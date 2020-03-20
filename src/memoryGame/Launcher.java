package memoryGame;

import java.awt.*;

public class Launcher {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Game game = new Game();
            }
        });
        TypesGenerator typesGenerator = new TypesGenerator();
        System.out.println(typesGenerator.generateRandomTypes());
    }
}
