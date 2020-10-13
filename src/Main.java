import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner reader = new Scanner(System.in);
            int sum = 0;
            int read;
            System.out.print("Type the first number: ");
            read = Integer.parseInt(input.nextLine());
            sum = sum + read;
            System.out.print("Type the second number: ");
            read = Integer.parseInt(input.nextLine());
            sum = sum +read;
            System.out.print("Type the third number: ");
            read = Integer.parseInt(input.nextLine());
            sum = sum +read;
            System.out.println("Sum: " + sum);
    }
}