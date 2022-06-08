package Chapter6;

import java.time.Year;

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 접근자
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // 설정자
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Point [x = " + x + ", y = " + y + "]";
    }
}

class MovablePoint extends Point {
    private int xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    // 접근자
    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    // 설정자
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint [x = " + getX() + ", y = " + getY() + " xSpeed = " + xSpeed + " ySpeed = " + ySpeed + "]";
    }
}

public class Main2 {
    public static void main(String[] args) {
    }
}
