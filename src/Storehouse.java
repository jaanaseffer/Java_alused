import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    public Map<String, Integer> productPrice;
    public Map<String, Integer> productStock;

    public Storehouse() {
        productPrice = new HashMap<>();
        productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        if (productPrice.containsKey(product)) {
            return productPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productStock.containsKey(product)) {
            return productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (productStock.containsKey(product) && productStock.get(product) > 0) {
            productStock.put(product, productStock.get(product)-1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return productStock.keySet();
    }
}
