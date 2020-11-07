import java.util.ArrayList;
import java.util.Collections;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    public void add(Card card) {
        this.hand.add(card);
    }
    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }
}
