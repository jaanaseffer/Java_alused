package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private Box box;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.box = new Box(boxesVolume);
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        if (things.isEmpty() == false) {
            this.boxes.add(box);
            for (Thing thing : things) {
                if (this.box.addThing(thing) == true) {

                } else  {
                    Box newBox = new Box(this.box);
                    newBox.addThing(thing);
                    this.boxes.add(newBox);
                }
            }
        }
        return this.boxes;
    }
}
