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
        if (this.balance >= 2.5) {
            this.balance = this.balance - 2.5;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance >= 4.0) {
            this.balance = this.balance - 4.0;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount >= 0) {
            this.balance += amount;
        }
    }

}