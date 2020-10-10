import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("How old are you?");
            int age = Integer.parseInt(input.nextLine());
            if (age >= 18) {
                System.out.println("You have reached the age of majority!");
            } else {
                System.out.println("You have not reached the age of majority yet!");
            }
    }
}