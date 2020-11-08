package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> contents;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.contents = new ArrayList<>();
    }

    public Box(Box box) {
        this.contents = new ArrayList<>();
        this.maximumCapacity = box.maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() <= this.maximumCapacity) {
            this.contents.add(thing);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int totalVolume = 0;
        for (Thing thing : this.contents) {
            totalVolume += thing.getVolume();
        }
        return totalVolume;
    }
}
