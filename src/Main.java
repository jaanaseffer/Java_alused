import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int amountOfExtrasInBurger = 0;
        double totalSum = 0;


        // Creating burgers
        Burger chickenBurger = new Burger("Chicken Burger", "chicken", "white bread", 5.00);
        Burger oldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "beef", "white bread", 6.00);
        Burger newYorkBurger = new Burger("New York Burger", "pork", "grain bread", 5.50);

        // Adding extras to the burgers
        chickenBurger.addExtras("cheese", 0.5, "salad", 0.3, "tomato", 0.5, "mayo", 0.5);
        oldFashionedCheeseburger.addExtras("bacon", 0.7, "cucumber", 0.5, "onion", 0.3, "bacon sauce", 0.5);
        newYorkBurger.addExtras("pineapple", 0.7, "tomato", 0.5, "cucumber", 0.5, "onion", 0.3);

        // Creating new burger menu
        BurgerMenu burgersMenu = new BurgerMenu();

        // Adding burgers to the menu
        burgersMenu.addToBurgerMenu(chickenBurger);
        burgersMenu.addToBurgerMenu(oldFashionedCheeseburger);
        burgersMenu.addToBurgerMenu(newYorkBurger);

        ArrayList<Burger> burgers = new ArrayList<>();
        int nrInQueue = 1;
        for (Burger burger : burgersMenu.burgerMenu()) {
            System.out.println(nrInQueue + ". " + burger.burgerName() + ": " + burger.burgerMeat() + ", " + burger.burgerBread());
            nrInQueue++;
        }

        while (true) {
            System.out.println("Choose burger (Press 0 when order is done): ");
            int selectedBurger = Integer.parseInt(input.nextLine());
            if (selectedBurger == 0) {
                break;
            }

            Burger customersBurgers = burgersMenu.chooseBurger((selectedBurger));
            burgers.add(customersBurgers);
            customersBurgers.displayExtrasForBurger();

            while (true) {
                System.out.println("Choose extras (Press enter when you are done: ");
                String extra = reader.nextLine();

                if (extra.isEmpty()) {
                    break;
                }

                customersBurgers.chooseExtras(extra);

                if (customersBurgers.nameOfExtra1().equals(extra)) {
                    customersBurgers.sumUpThePrice(customersBurgers.priceOfExtra1());
                } else if (customersBurgers.nameOfExtra2().equals(extra)) {
                    customersBurgers.sumUpThePrice(customersBurgers.priceOfExtra2());
                } else if (customersBurgers.nameOfExtra3().equals(extra)) {
                    customersBurgers.sumUpThePrice(customersBurgers.priceOfExtra3());
                } else if (customersBurgers.nameOfExtra4().equals(extra)) {
                    customersBurgers.sumUpThePrice(customersBurgers.priceOfExtra4());
                }
            }
            totalSum = totalSum + customersBurgers.makeTheBurger();
            amountOfExtrasInBurger = amountOfExtrasInBurger + customersBurgers.numberOfExtras();
            System.out.println("Current amount to pay: " + totalSum + ". Extras in the burgers: " + amountOfExtrasInBurger);
        }
        System.out.println("Your receipt:");
        for (Burger burger : burgers) {
            System.out.println(burger.burgerName() + ": " + burger.burgerPrice());
        }
        System.out.println("You have to pay: " + totalSum);
    }

}