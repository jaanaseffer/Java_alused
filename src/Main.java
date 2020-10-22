import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner input = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int number = Integer.parseInt((input.nextLine()));
        while (number > 0) {
            stats.addNumber(number);
            number = Integer.parseInt((input.nextLine()));
        }
        System.out.println("sum: " + stats.sum());
    }
}