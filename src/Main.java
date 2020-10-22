public class Main {
    public static void main(String[] args) {
        Menu caffee = new Menu();

        caffee.addMeal("Hamburger");
        caffee.addMeal("Fish'n'Chips");
        caffee.addMeal("Sauerkraut");

        caffee.printMeals();

        caffee.clearMenu();

        caffee.printMeals();
    }
}