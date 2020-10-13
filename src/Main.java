import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Type a number: ");
            int number = Integer.parseInt(input.nextLine());
            int fact = 1;
            int i = 1;
            while(number >= i) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial is " + fact);
    }
}