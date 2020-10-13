public class Main {
    public static void main(String[] args) {
        xmasTree(10);
    }
    public static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            size--;
        }
    }
    public static void printStars(int size) {
        int i = 0;
        while (i < size){
            System.out.print("*");
            size--;
        }
    }
    public static void xmasTree(int height) {
        int i = 0;
        int spaces = height -1 ;
        int stars = 1;
        while (i < height) {
            printWhitespaces(spaces);
            printStars(stars);
            stars += 2;
            spaces -= 1;
            i++;
            System.out.println();
        }
            printWhitespaces(height-2);
            printStars(3);
            System.out.println();
            printWhitespaces(height-2);
            printStars(3);
    }
}