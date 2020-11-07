import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    public Map<String, Purchase> purchases;

    public ShoppingBasket() {
        purchases = new HashMap<>();
    }

    public void add(String product, int price) {
        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }

    public int price(){
        int sum = 0;
        for (Purchase p : purchases.values()) {
            sum += p.price();
        }
        return sum;
    }
}
