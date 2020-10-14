import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Result: " + word.substring(0, length));
    }
}