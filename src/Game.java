import java.util.*;

public class Game {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>(4);
        String names[] = {"Zohan", "Ashiya", "Rahil", "Shoaib"};
        for(int i = 0; i < names.length; i++){
            players.add(new Player(names[i]));
        }

        //Build a new deck
        Card cards[] = Card.createCards();

        //Shuffle the deck
        Card.shuffleCards(cards, 500);

        //Distribute the deck amongst all the players
        for(int i = 0; i < cards.length; i++){
            players.get(i % 4).giveCard(cards[i]);
        }

        //Print the player and all the card that he has
        for(Player player: players){
            System.out.println(player.name);
            for(Card card: player.hand){
                System.out.print(card.printCard() + ",");
            }
            System.out.println();
        }
        int currentPlayer = (int)Math.floor(Math.random() * 4);
        int round = 0;
        while(round < 13){

        }
    }
}
