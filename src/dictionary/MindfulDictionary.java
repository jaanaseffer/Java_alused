package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class MindfulDictionary {
    private HashMap<String, String> finToEng;
    private HashMap<String, String> engToFin;
    private File file;
    private FileWriter writer;


    public MindfulDictionary() {
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
    }

    public MindfulDictionary(String file) throws IOException {
        this();
        this.file = new File(file);
    }

    public void add(String word, String translation) {
        if (!this.finToEng.containsKey(word)) {
            this.finToEng.put(word, translation);
        }
        if (!this.engToFin.containsKey(translation)) {
            this.engToFin.put(translation, word);
        }
    }

    public String translate(String word) {
        if (this.finToEng.containsKey(word)) {
            return this.finToEng.get(word);
        }
        if (this.engToFin.containsKey(word)) {
            return this.engToFin.get(word);
        }
        return null;
    }

    public void remove(String word) {
        if (this.finToEng.containsKey(word)) {
            String translation = this.finToEng.get(word);
            this.finToEng.remove(word);
            this.engToFin.remove(translation);
        } else if (this.engToFin.containsKey(word)) {
            String translation = this.engToFin.get(word);
            this.engToFin.remove(word);
            this.finToEng.remove(translation);
        }
    }
}
