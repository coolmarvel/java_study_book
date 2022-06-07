package sec1;

class Circle {
    double radius;
    String color;

    // 생성자1 (임의의 반지름과 색상을 가진 객체 생성자)
    public Circle(double radius, String color) {
        radius = radius;
        color = color;
    }

    // 생성자2 (파랑 객체 생성자)
    public Circle(double radius) {
        this.radius = radius;
        this.color = "파랑";
    }

    // 생성자3 (반지름이 10.0인 객체 생성자)
    public Circle(String color) {
        this.radius = 10.0;
        this.color = color;
    }

    // 생성자4 (반지름이 10.0인 빨강 객체 생성자)
    public Circle() {
        this.radius = 10.0;
        this.color = "빨강";
    }
}

public class CircleDemo3 {
    public static void main(String[] args) {
        // 생성자1 호출
        Circle c1 = new Circle(10.0, "빨강");

        // 생성자2 호출
        Circle c2 = new Circle(10.0);

        // 생성자3 호출
        Circle c3 = new Circle("노랑");

        // 생성자4 호출
        Circle c4 = new Circle();
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

}
