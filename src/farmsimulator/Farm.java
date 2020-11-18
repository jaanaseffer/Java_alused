package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        String result = "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.getBulkTank().toString() + "\n";
        if (this.cows.isEmpty()) {
            result += "No cows";
        } else {
            result += "Animals:\n";
            for (Cow cow : this.cows) {
                result += "      " + cow.toString() + "\n";
            }
        }
        return result;
    }
}
