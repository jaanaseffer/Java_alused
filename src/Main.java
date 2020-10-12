import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner reader = new Scanner(System.in);
            String usernameOne = "alex";
            String usernameTwo = "emily";
            String passwordOne = "mightyducks";
            String passwordTwo = "cat";
            System.out.print("Type your username: ");
            String username = reader.nextLine();
            System.out.print("Type your password: ");
            String password = reader.nextLine();
            if ((usernameOne.equals(username) && passwordOne.equals(password)) || (usernameTwo.equals(username) && passwordTwo.equals(password))) {
                System.out.println("You are logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }
    }
}