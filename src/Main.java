import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (number >=0) {
            System.out.println("The number is positive.");
        } else {
            System.out.printf("The number is not positive.");
        }
    }
}
