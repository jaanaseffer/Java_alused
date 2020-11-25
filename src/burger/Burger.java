package burger;

import farmsimulator.Barn;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String name;
    private String meatType;
    private String breadType;
    private double price;
    private List<String> burgerExtras;

    public Burger(String name, String meatType, String breadType, double price) {
        this.name = name;
        this.meatType = meatType;
        this.breadType = breadType;
        this.price = price;
        this.burgerExtras = new ArrayList<>();
    }
}
