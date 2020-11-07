public class Book1 implements ToBeStored {
    public String writer;
    public String name;
    public double weight;

    public Book1(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return this.writer + ": " + this.name;
    }

    public double weight() {
        return this.weight;
    }
}
