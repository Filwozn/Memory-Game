# Memory-Quiz-Game
## General Info
Java Swing game imitatating classic memory game with special twist of art paintings on cards and quiz afer every matches.
## Table of contents
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Screenshots](#screenshots)
* [Code examples](#code-examples)
## Technologies
Java 11, Swing, Serialization API, Multithreading
## Setup
Application aviable only in developer state. It should be started on JDK 11 after cloning project to your IDE. 
## Features
Full implemetation of Memory Game with 3 level of dificuty and mouse control. 
Each game is unique due to radmonize generating of suite from bank of 61 paintigs.
Correct match twigger quiz in witch to score you have to quess who is author of picter and pictures name from 4 options.
In background there is a classical music.
## Screenshots
## Code examples
Examples contains clear and decomposed code samples.
### Example 1
Mouse card selection executed on other thread.
```java
 public void selectOnOtherThreat(int x, int y) {
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                onSelection(x, y);
                return null;
            }
        };
        worker.execute();
    }

    private void onSelection(int x, int y) {
        Card card = findCardByCords(x, y);
        if (canBeSelected(card)) {
            addSelectedCard(card);
            compareSelectedCards();
        }
    }
```
### Example 2
Loading pictures from file.
```java
  private static final String PICTURES_FOLDER = "resources/images";

    public static Set<Picture> loadPictures() {
        Set<Picture> pictures = new HashSet<>();
        File folder = new File(PICTURES_FOLDER);
        File[] filePictures = folder.listFiles();
        for (File filePicture : filePictures) {
            Picture picture = loadPicture(filePicture);
            pictures.add(picture);
        }
        return pictures;
    }
```
