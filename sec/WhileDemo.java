package sec;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;

        while (i < 5) {
            System.out.print(i);
            i++;
        }
        System.out.println();


        // 구구단
        int row = 2;

        while (row < 10) {
            int column = 1;
            while (column < 10) {
                System.out.printf("%4d", row * column);
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
