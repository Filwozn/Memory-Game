package view;

import memoryGame.Card;
import memoryGame.Picture;
import memoryGame.SingletonPictures;


import java.awt.image.BufferedImage;

public class ViewGraphicPanelQuiz extends ViewGraphicPanel {
    public ViewGraphicPanelQuiz() {
        addPictureBackground();
    }
    private void addPictureBackground() {
        BufferedImage pictureBackgroundImage = SingletonPictures.getPictureBackground();
        PanelImage pictureBackground = new PanelImage(pictureBackgroundImage,50,50, Card.CARD_WIDTH*2,Card.CARD_HEIGHT*2);
        images.add(pictureBackground);
    }
    public void addCorrectPicture(Picture correctPicture){
        PanelImage correctPictureImage = new PanelImage(correctPicture.getImage(),50,50,(int)(Card.CARD_WIDTH*1.6),(int)(Card.CARD_HEIGHT*1.6));
        images.add(correctPictureImage);
    }
}
