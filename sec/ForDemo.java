package sec;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        // 구구단
        for (int row = 2; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
    }
}
