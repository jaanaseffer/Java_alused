import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translated;

    public Dictionary() {
        this.translated = new HashMap<>();
    }

    public String translate(String word) {
        if (this.translated.containsKey(word)) {
            return this.translated.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        translated.put(word, translation);
    }

    public int amountOfWords() {
        return this.translated.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> keySet = new ArrayList<>();
        for (String key : translated.keySet()) {
            keySet.add(key + " = " + translated.get(key));
        }
        return keySet;
    }
}
