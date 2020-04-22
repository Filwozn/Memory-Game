package memoryGame;

import controller.GameController;
import view.GameView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static memoryGame.Card.CARD_HEIGHT;
import static memoryGame.Card.CARD_WIDTH;

public class MouseManager implements MouseListener {
    private GameController gameController;

    public MouseManager(GameController gameController) {
        this.gameController = gameController;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int logicX = -1;
        int logicY = -1;
        for (int col = 0; col <  GameView.COLUMNS; col++) {
            int leftBorder = GameController.OFFSET_BETWEEN * col + col* CARD_WIDTH + GameController.OFFSET_BETWEEN;
            int rightBorder =  GameController.OFFSET_BETWEEN * col + col* CARD_WIDTH + GameController.OFFSET_BETWEEN + CARD_WIDTH;
            if (e.getX() >= leftBorder && e.getX() <= rightBorder) {
                logicX = col;
                break;
            }
        }
        if (logicX < 0) {
            System.out.println("Margines!");
            return;
        }
        for (int row = 0; row <  GameView.ROWS; row++) {
            int topBorder = GameController.OFFSET_BETWEEN * row + row* CARD_HEIGHT + GameController.OFFSET_BETWEEN;
            int bottomBorder =  GameController.OFFSET_BETWEEN * row + row* CARD_HEIGHT + GameController.OFFSET_BETWEEN + CARD_HEIGHT;
            if (e.getY() >= topBorder && e.getY() <= bottomBorder) {
                logicY = row;
                break;
            }
        }
        if (logicY < 0) {
            System.out.println("Margines!");
            return;
        }



        gameController.click(logicX,logicY);    // NullPointerException występuje, gdy wywołamy metodę na zmiennej, w której jest nulll.
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
