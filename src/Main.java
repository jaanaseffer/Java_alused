import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String studentnumber = reader.nextLine();
            students.add(new Student(name, studentnumber));
        }

        for (Student student: students) {
            System.out.println(student);
        }
    }
}