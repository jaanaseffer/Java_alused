import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int upperNumber = Integer.parseInt(reader.nextLine());
        int currentNumber = 1;
        int sum = 0;
        while (currentNumber <= upperNumber) {
            sum += currentNumber;
            currentNumber++;
        }
        System.out.println("Sum is " + sum);
    }
}

