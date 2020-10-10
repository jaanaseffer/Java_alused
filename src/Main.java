import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner reader = new Scanner(System.in);
            System.out.print("Type your name: ");
            String nameOne = reader.nextLine();
            System.out.print("Type your age: ");
            int ageOne = Integer.parseInt(input.nextLine());
            System.out.println();
            System.out.print("Type your name: ");
            String nameTwo = reader.nextLine();
            System.out.print("Type your age: ");
            int ageTwo = Integer.parseInt(input.nextLine());
            System.out.println(nameOne + " and " + nameTwo + " are " + (ageOne+ageTwo) + " years old in total.");
    }
}