import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Type the first number: ");
            int numberOne = Integer.parseInt(input.nextLine());
            System.out.print("Type the second number: ");
            int numberTwo = Integer.parseInt(input.nextLine());
            if (numberOne < numberTwo) {
                System.out.println("Greater number: " + numberTwo);
            } else if (numberOne > numberTwo){
                System.out.println("Greater number: " + numberOne);
            } else {
                System.out.println("The numbers are equal!");
            }
    }
}