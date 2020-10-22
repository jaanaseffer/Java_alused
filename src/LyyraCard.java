public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
         return "This card has " + this.balance + " euros.";
    }

    public void payEconomical() {
        // write code here
        this.balance = this.balance - 2.5;
    }

    public void payGourmet() {
        // write code here
        this.balance = this.balance - 4.0;
    }
}