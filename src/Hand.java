import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
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

    public int compareTo(Hand hand) {
        return this.totalValue() - hand.totalValue();
    }
    public int totalValue() {
        int totalValue = 0;
        for (Card card : this.hand) {
            totalValue += card.getValue();
        }
        return totalValue;
    }
    public void sortAgainstSuit() {
        this.hand.sort(new SortAgainstSuit());
        System.out.println(this.hand);
    }
}
