package sec1.etc;

public class CircleDemo {
    // 클래스 내부의 멤버 접근
    static double radius;

    static double findArea() {
        return 3.14 * radius * radius;
    }

    static void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x + y);
    }

    public static void main(String[] args) {
        radius = 10.0;

        double area = findArea();

        show(radius, area);
    }
}
