package sec2;

public class OneToTenDemo {
    static int sumOnToTen;

    static {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            sumOnToTen = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOnToTen);
    }
}
