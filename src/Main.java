import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    public static boolean palindrome(String text) {
        String help = "";
        int i = text.length() - 1;
        while (i >= 0) {
            char character = text.charAt(i);
            help = help + character;
            i--;
        }
        if (text.equals(help)) {
            return true;
        } else {
            return false;
        }
    }
}