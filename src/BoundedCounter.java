public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int startValue) {
        // write code here
        this.upperLimit = 59;
        this.value = startValue;
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
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
