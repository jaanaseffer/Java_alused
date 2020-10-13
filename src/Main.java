public class Main {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
    }
    public static void printStars(int size) {
        int i = 0;
        while (i < size){
            System.out.print("*");
            i++;
        }
    }
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printWhitespaces(size-i);
            printStars(i);
            i++;
            System.out.println();
        }
    }
}