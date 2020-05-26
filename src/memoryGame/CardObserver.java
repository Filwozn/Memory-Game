package memoryGame;

//OBSERVER PATTERN
public interface CardObserver {

     void cardStateChanged();
     void triggerQuiz(Picture matched);

}
