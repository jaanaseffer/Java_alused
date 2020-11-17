package farmsimulator;

import java.util.Random;

public class Cow extends BulkTank implements Milkable, Alive{

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String name;

    public Cow() {
        super(new Random().nextInt(26) + 15);
        this.name = NAMES[new Random().nextInt(30)];
    }

    public Cow(String name) {
        super(new Random().nextInt(26) + 15);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return super.getCapacity();
    }

    public double getAmount() {
        return super.getVolume();
    }

    @Override
    public String toString() {
        return this.name + " " + super.toString();
    }

    @Override
    public double milk() {
        double amount = super.getVolume();
        super.getFromTank(amount);
        return amount;
    }

    @Override
    public void liveHour() {
        super.addToTank(0.7 + new Random().nextDouble() * (1.3));
    }
}
