public class Main {
    public static void main(String[] args) {
        int size = 10;
        int rowIndex = 0;
        int columnIndex = 0;
        for (rowIndex = 0; rowIndex < size; rowIndex++) {
            for (columnIndex = 0; columnIndex < size; columnIndex++) {
                if (rowIndex > columnIndex) {
                    System.out.print(size-1-rowIndex);
                } else {
                    System.out.print(size-1-columnIndex);
                }
            }
            System.out.println();
        }
    }

}