import java.util.ArrayList;

public class BurgerMenu {
    private ArrayList<Burger> burgers = new ArrayList<>();

    public Burger chooseBurger(int nrInQueue) {
        return burgers.get(nrInQueue - 1);
    }

    public ArrayList<Burger> burgerMenu() {
        return this.burgers;
    }

    public void addToBurgerMenu(Burger burger) {
        burgers.add(burger);
    }
}
