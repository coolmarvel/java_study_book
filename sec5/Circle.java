package sec5;

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("원을 그리다.");
    }

    public double findArea() {
        return pi * radius * radius;
    }
}
