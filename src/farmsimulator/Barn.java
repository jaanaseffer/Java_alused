package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot robot;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.bulkTank);
    }

    public void takeCareOf(Cow cow) {
        try {
            double amount = cow.milk();
            this.bulkTank.addToTank(amount);
        } catch (Exception e) {
            System.out.println("The milking robot is not installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow cow : cows) {
                takeCareOf(cow);
            }
        } catch (Exception e) {
            System.out.println("The milking robot is not installed");
        }
    }

    public String toString() {
        return this.bulkTank.toString();
    }
}
