package sec;

public class DoWhilleDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i);
            i++;
        } while (i < 5);
        System.out.println();

        int x = 10;
        do {
            x++;
        } while (i < 5);
        System.out.println("do-while 문 실행 후 : " + x);

        x = 10;
        while (x < 5) {
            x++;
        }
        System.out.println("while문 실행 후 : " + x);


        // 구구단
        int row = 2;
        do {
            int column = 1;
            do {
                System.out.printf("%4d", row * column);
                column++;
            } while (column < 10);
            System.out.println();
            row++;
        } while (row < 10);
    }
}
