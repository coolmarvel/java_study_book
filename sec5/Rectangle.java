package sec5;

class Rectangle extends Shape {
    double x, y;

    public Rectangle(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("사각형을 그리다.");
    }

    public double findArea() {
        return x * y;
    }
}
