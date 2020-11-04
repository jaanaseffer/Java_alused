public class Main {
    public static void main(String[] args) {
        CivilService test = new CivilService();
        System.out.println(test.getDaysLeft());
        test.work();
        System.out.println(test.getDaysLeft());
    }

}