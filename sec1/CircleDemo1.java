package sec1;

class Circle {
    private double radius;

    // 접근자
    public double getRadius() {
        return radius;
    }

    // 설정자
    public void setRadius(double r) {
        this.radius = r;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }

    void show(double x, double y) {
        System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}

public class CircleDemo1 {
    public static void main(String[] args) {
        Circle myCircle = new Circle();

        myCircle.setRadius(10.0);

        myCircle.show(myCircle.getRadius(), myCircle.findArea());
    }
}
