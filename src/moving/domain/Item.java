package moving.domain;

public class Item implements Thing, Comparable<Item> {
    private final String name;
    private final int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return this.getVolume() - o.getVolume();
    }
}
