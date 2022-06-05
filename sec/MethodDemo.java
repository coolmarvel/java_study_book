package sec;

public class MethodDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10의 합은 " + sum);

        sum = 0;
        for (int i = 10; i < 101; i++) {
            sum += i;
        }
        System.out.println("10~100의 합은 " + sum);

        sum = 0;
        for (int i = 100; i < 1001; i++) {
            sum += i;
        }
        System.out.println("100~1000의 합은 " + sum);

        System.out.println("1~10의 합은 " + sum(1, 10));
        System.out.println("10~100의 합은 " + sum(10, 100));
        System.out.println("100~1000의 합은 " + sum(100, 1000));
    }

    public static int sum(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += k;
        }
        return sum;
    }
}
