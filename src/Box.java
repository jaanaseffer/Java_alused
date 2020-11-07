import java.util.ArrayList;

public class Box implements ToBeStored {
    public ArrayList<ToBeStored> stuff;
    public double maxWeight;

    public Box(double maxWeight) {
        this.stuff = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    @Override
    public double weight() {
        double weight = 0;

        for (ToBeStored s : stuff) {
            weight +=s.weight();
        }
        return weight;
    }
    public void add(ToBeStored object) {
        if (object.weight() + weight() < maxWeight) {
            stuff.add(object);
        }
    }

    public String toString() {
        return "Box: " + stuff.size() + " things, total weight " + weight() + " kg";
    }
}
