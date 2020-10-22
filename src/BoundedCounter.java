public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        if (this.value != this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here

        return "" + this.value;
    }
}
