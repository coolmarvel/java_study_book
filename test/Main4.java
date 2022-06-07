package test;

public class Main4 {
    // 5번
    // 각 변의 길이 합이 20 이하이며 각 변의 길이가 정수인 직각 삼각형의 모든 변을 구하시오.
    // 피타고라스 정리, 즉 a^2 + b^2 = c^2을 이용하고 for문을 중첩해서 사용한다.
    public static void main(String[] args) {
        int a, b, c;
        for (a = 1; a < 10; a++) {
            for (b = 1; b < 10; b++) {
                for (c = 1; c < 10; c++) {
                    if ((a * a + b * b == c * c) && (a + b + c <= 20)) {
                        System.out.printf("a = %d b = %d c = %d", a, b, c);
                        System.out.println();
                    }
                }
            }
        }
    }
}
