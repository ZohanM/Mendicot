import java.util.*;

public class Player {
    private int cardsInHand;
    List<Card> hand;
    String name;

    public Player(String name){
        this.cardsInHand = 0;
        hand = new LinkedList<Card>();
        this.name = name;
    }

    public boolean giveCard(Card newCard){
        if(cardsInHand > 52/4){
            return false;
        }
        hand.add(newCard);
        cardsInHand++;
        return true;
    }
}
