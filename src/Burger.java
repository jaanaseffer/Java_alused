import java.util.ArrayList;

public class Burger {
    private String name;
    private String meat;
    private String bread;
    private double price;

    private ArrayList<String> chosenExtras;
    private int nrOfExtras;

    // Burgeri lisandid ja nende hinnad
    private String extra1;
    private double extra1Price;
    private String extra2;
    private double extra2Price;
    private String extra3;
    private double extra3Price;
    private String extra4;
    private double extra4Price;

    public void addExtras(String extra1, double extra1Price, String extra2, double extra2Price, String extra3, double extra3Price, String extra4, double extra4Price) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
        this.extra4 = extra4;
        this.extra1Price = extra1Price;
        this.extra2Price = extra2Price;
        this.extra3Price = extra3Price;
        this.extra4Price = extra4Price;
    }

    public Burger(String name, String meat, double price) {
        this.bread = "grain bread";
        this.name = name;
        this.meat = meat;
        this.price = price;
    }

    public Burger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
        this.chosenExtras = new ArrayList<>();
        this.nrOfExtras = 0;
    }
    public String burgerName() {
        return this.name;
    }
    public String burgerMeat() {
        return this.meat;
    }
    public String burgerBread() {
        return this.bread;
    }
    public double burgerPrice() {
        return this.price;
    }
    public String nameOfExtra1(){
        return this.extra1;
    }
    public String nameOfExtra2(){
        return this.extra2;
    }
    public String nameOfExtra3(){
        return this.extra3;
    }
    public String nameOfExtra4(){
        return this.extra4;
    }
    public double priceOfExtra1() {
        return this.extra1Price;
    }
    public double priceOfExtra2() {
        return this.extra2Price;
    }
    public double priceOfExtra3() {
        return this.extra3Price;
    }
    public double priceOfExtra4() {
        return this.extra4Price;
    }
    public void displayExtrasForBurger() {
        System.out.println("Choose extras: " + this.extra1 + ", " + this.extra2 + ", " + this.extra3 + ", " + this.extra4);
    }
    public int numberOfExtras() {
        return this.nrOfExtras;
    }
    public void chooseExtras(String extra) {
        this.nrOfExtras++;
        chosenExtras.add(extra);
    }
    public ArrayList<String> arrayOfExtras() {
        return this.chosenExtras;
    }

    public void sumUpThePrice(double amount) {
        this.price = this.price + amount;
    }

    public double makeTheBurger() {
        return this.price;
    }
}
