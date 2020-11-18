package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class OneThingBox extends Box {
    private Thing thing;

    public OneThingBox() {

    }

    @Override
    public void add(Thing thing) {
        if (this.thing == null) {
            this.thing = thing;
        }
    }

    @Override
    public void add(Collection<Thing> things) {
        ArrayList<Thing> list = new ArrayList<>();
        if (this.thing == null) {
            this.thing = list.get(0);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        try {
            if (this.thing.equals(thing)) {
                return true;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
