package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private Collection<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public boolean isThereRoom(Thing thing) {
        int weight = 0;
        for (Thing content : this.things) {
            weight += content.getWeight();
        }
        if (weight + thing.getWeight() <= this.maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void add(Thing thing) {
        if (isThereRoom(thing)) {
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing content : this.things) {
            if (content.equals(thing)) {
                return true;
            }
        }
        return false;
    }
}
