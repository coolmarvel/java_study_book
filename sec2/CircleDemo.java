package sec2;

class Circle {
    // double radius;
    // String color;

    // public Circle(double radius, String color) {
    // this.radius = radius;
    // this.color = color;
    // }

    // public Circle(double radius) {
    // this(radius, "파랑");
    // }

    // public Circle(String color) {
    // this(10.0, color);
    // }

    // public Circle() {
    // this(10.0, "빨강");
    // }

    double radius;
    static int numOfcircles = 0;
    int numCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        numOfcircles++;
        numCircles++;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10.0);
        Circle yourCircle = new Circle(5.0);

        System.out.println("원의 개수 : " + Circle.numOfcircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);
    }

    void print() {
        System.out.println("정적 멤버에 대한 내용입니다.");
    }
}
