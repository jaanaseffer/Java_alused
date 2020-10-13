import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many?");
        int number = Integer.parseInt(input.nextLine());
        int i = 1;
        while (number >= i) {
            printText();
            i++;
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}