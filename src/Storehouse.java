import java.util.HashMap;
import java.util.Map;

public class Storehouse {
    public Map<String, Integer> productPrice;

    public Storehouse() {
        productPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
    }

    public int price(String product) {
        if (productPrice.containsKey(product)) {
            return productPrice.get(product);
        }
        return -99;
    }
}
