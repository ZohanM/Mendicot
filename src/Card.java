

public class Card {
    public String value;
    public String suit;
    public static String suits[] = {"♠", "♣", "♦", "♥"};
    public static String values[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Card(String value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public static Card[] createCards(){
        Card cards[] = new Card[52];
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < values.length; j++){
                cards[values.length * i + j] = new Card(values[j], suits[i]);
            }
        }
        return cards;
    }

    public static void shuffleCards(Card cards[], int shuffleAmount){
        if(cards.length != 52){
            System.out.println("WRONG AMOUNT OF CARDS");
            System.exit(-1);
        }

        for(int i = 0; i < shuffleAmount; i++) {
            int first = (int) Math.floor(Math.random() * 52);
            int second = (int) Math.floor(Math.random() * 52);
            swap(cards, first, second);
        }
    }
    private static void swap(Card cards[], int first, int second){
        if((first < 0 || first > 52) || (second < 0 || second > 52)){
            System.out.println("WRONG INDEX FOR SWAPPING");
            System.exit(-2);
        }
        Card temp = cards[first];
        cards[first] = cards[second];
        cards[second] = temp;
    }

    public String printCard(){
        return suit + value;
    }
}
