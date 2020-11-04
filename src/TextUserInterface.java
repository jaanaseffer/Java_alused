import java.util.Scanner;

public class TextUserInterface {
    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements: ");
        System.out.println("quit - quit the interface");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("add - adds a word pair to the dictionary");

        while (true) {
            System.out.println("");
            System.out.println("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                System.out.println("In finnish: ");
                String word = reader.nextLine();
                System.out.println("Translation: ");
                String translation = reader.nextLine();
                add(word, translation);
            } else if (input.equals("translate")) {
                System.out.println("Give a word");
                String word = reader.nextLine();
                System.out.println("Translation: " + translate(word));
            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add(String word, String translation) {
        dictionary.add(word, translation);
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }
}
