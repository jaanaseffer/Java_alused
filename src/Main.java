import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
    public static String reverse(String text) {
        String help = "";
        int i = text.length() - 1;
        while (i >= 0) {
            char character = text.charAt(i);
            help = help + character;
            i--;
        }
        return help;
    }
}