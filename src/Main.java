public class Main {
    public static void main(String[] args) {
        MilitaryService test = new MilitaryService(200);
        System.out.println(test.getDaysLeft());
        test.work();
        System.out.println(test.getDaysLeft());
    }

}