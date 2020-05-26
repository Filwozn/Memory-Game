package model;

import memoryGame.Picture;

import java.util.*;

public class QuizService {
    private Picture correctAnswer;
    private List<Picture> allAnswers;

    public QuizService(Picture correctAnswer, Set<Picture> allPictures) {
        this.correctAnswer = correctAnswer;
        prepareAnswers(correctAnswer, allPictures);
    }

    public void prepareAnswers(Picture correctPicture, Set<Picture> allPictures) {
        allPictures.remove(correctPicture);
        LinkedList<Picture> allPicturesList = new LinkedList<>(allPictures);
        Collections.shuffle(allPicturesList);
        Queue<Picture> allPicturesQueue = allPicturesList;
        allAnswers = new ArrayList<>();
        allAnswers.add(correctPicture);
        for (int i = 0; i < 3; i++) {
            allAnswers.add(allPicturesQueue.poll());
        }
        Collections.shuffle(allAnswers);
    }

    public Picture getCorrectAnswer() {
        return correctAnswer;
    }

    public List<Picture> getAllAnswers() {
        return allAnswers;
    }
    public List<String> getAllAnswersStrings(){
        List<String> answersStringsList = new ArrayList<>();
        for (Picture picture : allAnswers) {
            answersStringsList.add(picture.getAuthor() + " - " + picture.getTitle());
        }return  answersStringsList;
    }
}
