import java.util.Random;
public class PasswordRandomizer {
    // Define the variables here
    private int passwordLength;

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.passwordLength = length;
    }

    public String createPassword() {
        // Write the code here which returns the new password
        String password = "";
        Random randomizer = new Random();
        int i = 0;
        while (i < this.passwordLength) {
            int number = randomizer.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += (String.valueOf(symbol));
            i++;
        }
        return password;
    }
}
