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
}
