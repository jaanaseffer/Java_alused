package movable;

import java.util.ArrayList;

public class Group implements Movable {

    private final ArrayList<Movable> group;

    public Group() {
        this.group = new ArrayList<>();
    }

    public void addToGroup(Movable movable) {
        this.group.add(movable);
    }

    @Override
    public String toString() {
        StringBuilder positions = new StringBuilder();
        for (Movable p : this.group) {
            positions.append(p.toString()).append("\n");
        }
        return positions.toString();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable p: this.group) {
            p.move(dx, dy);
        }
    }
}
