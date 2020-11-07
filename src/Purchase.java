public class Purchase {
    public String product;
    public int amount;
    public int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.amount * this.unitPrice;
    }

    public void increaseAmount() {
        this.amount += 1;
    }

    public String toString() {
        return product + ": " + amount;
    }
}
