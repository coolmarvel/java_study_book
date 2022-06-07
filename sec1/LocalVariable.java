package sec1;

public class LocalVariable {
    public static void main(String[] args) {
        // 지역 변수의 사용 범위
        int a = 0;
        double b;

        // System.out.print(b);
        // 초기화되지 않고 사용할 수 없다.

        // System.out.print(a + c);
        // c 변수는 아직 선언되지 않아 사용불가.

        int c = 0;

        // public double d = 0.0;
        // 지역 변수는 public으로 선언 불가.

        for (int i = 0; i < 10; i++) {
            // int a = 1;
            // 이미 선언된 지역 변수 이름으로 다시 선언할 수 없다.
            System.out.print(i);
        }
    }
}
