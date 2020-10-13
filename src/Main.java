import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("First: ");
            int first = Integer.parseInt(input.nextLine());
            System.out.println("Last: ");
            int last = Integer.parseInt(input.nextLine());
            int sum = 0;
            while(first <= last) {
                sum += first;
                first++;
            }
            System.out.println("The sum is " + sum);
    }
}