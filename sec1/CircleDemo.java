package sec1;

class Circle {
    // 클래스 외부의 멤버 접근
    double radius;

    double findArea() {
        return 3.14 * radius * radius;
    }

    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        // 클래스 외부의 멤버 접근
        Circle mycCircle = new Circle();

        mycCircle.radius = 10.0;

        mycCircle.show(mycCircle.radius, mycCircle.findArea());
    }
}
