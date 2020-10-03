import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        boolean leapyear = false;
        if(year % 100 == 0){
            if(year % 400 == 0){
                leapyear = true;
            }
        } else if (year % 4 == 0){
            leapyear = true;
        }
        if(leapyear){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
