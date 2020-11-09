package dictionary;

public class Main {
    public static void main(String[] args) throws Exception {
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        // using the dictionary
        dict.add("tietokone", "computer");

        dict.save();
    }
}
