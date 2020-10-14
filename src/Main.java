import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println();

        print(programmingLanguages);
    }
    public static void print(ArrayList<String> printed) {
        for (String word: printed) {
            System.out.println(word);
        }
    }
    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
    }
}