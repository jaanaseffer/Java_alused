import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));

    }
    public static int countItems(ArrayList<String> list) {
        int listSize = list.size();
        return listSize;
    }
}