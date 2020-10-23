import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int currentDate = Calendar.getInstance().get(Calendar.DATE);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDay = new MyDate(currentDate, currentMonth, currentYear);

        return this.birthday.differenceInYears(currentDay);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
