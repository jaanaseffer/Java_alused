import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("First: ");
            int first = Integer.parseInt(input.nextLine());
            System.out.println("Last: ");
            int last = Integer.parseInt(input.nextLine());
            while (first <= last) {
                System.out.println(first);
                first++;
            }
    }
}