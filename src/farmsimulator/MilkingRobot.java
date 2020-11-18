package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() {

    }

    public BulkTank getBulkTank() {
        if (this.bulkTank == null) {
            return null;
        } else {
            return this.bulkTank;
        }
    }

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public void milk(Milkable milkable) {
        if (this.getBulkTank() == null) {
            throw new IllegalStateException("No milking robot installed");
        } else {
            this.bulkTank.addToTank(milkable.milk());
        }
    }
}
