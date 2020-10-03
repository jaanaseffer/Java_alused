import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you?");
        int number = Integer.parseInt(reader.nextLine());
        if (number >= 0 && number <= 120) {
            System.out.println("OK");
        } else if (number < 0 || number > 120) {
            System.out.println("Impossible!");
        }
    }
}
