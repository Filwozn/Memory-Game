package memoryGame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static memoryGame.Card.CARD_HEIGHT;
import static memoryGame.Card.CARD_WIDTH;

public class MouseManager implements MouseListener {
    private Game game;

    public MouseManager(Game game) {
        this.game = game;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int logicX = -1;
        int logicY = -1;
        for (int col = 0; col <  GameFrame.COLUMNS; col++) {
            int leftBorder = Game.OFFSET_BETWEEN * col + col* CARD_WIDTH + Game.OFFSET_BETWEEN;
            int rightBorder =  Game.OFFSET_BETWEEN * col + col* CARD_WIDTH + Game.OFFSET_BETWEEN + CARD_WIDTH;
            if (e.getX() >= leftBorder && e.getX() <= rightBorder) {
                logicX = col;
                break;
            }
        }
        if (logicX < 0) {
            System.out.println("Margines!");
            return;
        }
        for (int row = 0; row <  GameFrame.ROWS; row++) {
            int topBorder = Game.OFFSET_BETWEEN * row + row* CARD_HEIGHT + Game.OFFSET_BETWEEN;
            int bottomBorder =  Game.OFFSET_BETWEEN * row + row* CARD_HEIGHT + Game.OFFSET_BETWEEN + CARD_HEIGHT;
            if (e.getY() >= topBorder && e.getY() <= bottomBorder) {
                logicY = row;
                break;
            }
        }
        if (logicY < 0) {
            System.out.println("Margines!");
            return;
        }



        game.click(logicX,logicY);    // NullPointerException występuje, gdy wywołamy metodę na zmiennej, w której jest nulll.
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
