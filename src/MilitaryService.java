public class MilitaryService implements NationalService {

    int daysLeft = 0;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (daysLeft >= 1) {
            daysLeft--;
        }
    }
}
