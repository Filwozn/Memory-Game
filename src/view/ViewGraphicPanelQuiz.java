package view;

import memoryGame.Card;
import memoryGame.Picture;
import memoryGame.SingletonPictures;


import java.awt.image.BufferedImage;

public class ViewGraphicPanelQuiz extends ViewGraphicPanel {
    public ViewGraphicPanelQuiz() {

        super(SingletonPictures.getQuizBackground());
    }

    public void addCorrectPicture(Picture correctPicture){
        PanelImage correctPictureImage = new PanelImage(correctPicture.getImage(),120,64,(int)(Card.CARD_WIDTH*2.22),(int)(Card.CARD_HEIGHT*2.22));
        images.add(correctPictureImage);
    }

}
