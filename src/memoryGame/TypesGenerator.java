package memoryGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypesGenerator {
    public List<CardType> generateRandomTypes(){
        int amount = Game.ROWS*Game.COLUMNS;
        List<CardType> cardTypes = new ArrayList<>();
        if(isNotValidCardsAmount(amount)){
            System.out.println("test4.");
            return cardTypes;
        }
        addTypes( cardTypes, amount/2);

        Collections.shuffle(cardTypes);
        System.out.println("test");
        return cardTypes;
    }
    private void addTypes(List<CardType> cardTypes, int pairs){
        CardType[] values = CardType.values();
        for (int i = 0; i < pairs; i++) {
            CardType value = values[i];
            cardTypes.add(value);
            cardTypes.add(value);
        }
    }

    private boolean isNotValidCardsAmount(int amount) {
        return amount%2!=0 || amount<0 ||amount> CardType.values().length*2;
    }
}
