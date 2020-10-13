import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Type a number: ");
            int power = Integer.parseInt(input.nextLine());
            int number = 2;
            int i = 0;
            int sum = 0;
            while(power >= i) {
                sum = (int) (sum + Math.pow(number, i));
                i++;
            }
            System.out.println("The result is " + sum);
    }
}