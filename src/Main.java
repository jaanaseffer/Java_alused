import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while (true) {
            System.out.println("Type a word:");
            String word = reader.nextLine();
            if (!words.contains(word)) {
                words.add(word);
            } else {
                System.out.println("you gave the word " + word + " twice");
                break;
            }
        }
    }
}