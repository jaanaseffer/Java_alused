import java.io.File;
import java.util.Scanner;

public class Printer {
    private Scanner reader;
    private File file;

    public Printer(String fileName) throws Exception{
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(file);
        if (word.equals("")) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
