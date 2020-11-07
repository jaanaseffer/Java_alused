import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        cards.add( new Card(3, Card.CLUBS) );
        cards.add( new Card(2, Card.DIAMONDS) );
        cards.add( new Card(14, Card.CLUBS) );
        cards.add( new Card(12, Card.HEARTS) );
        cards.add( new Card(2, Card.CLUBS) );

        SortAgainstSuit suitSorter = new SortAgainstSuit();
        cards.sort(suitSorter);

        for (Card c : cards) {
            System.out.println( c );
        }
    }

}