package sec6;

import java.util.Arrays;

class Rectangle {
    private int width, heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int findArea() {
        return width * heigth;
    }

    public String toString() {
        return "사각형 [넓이 = " + width + ", 높이 = " + heigth + "]";
    }

    public int compareTo(Object o) {
        Rectangle other = (Rectangle) o;

        if (this.findArea() < other.findArea()) {
            return -1;
        } else if (this.findArea() > other.findArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5) };

        Arrays.sort(rectangles);

        for (Rectangle r : rectangles) {
            System.out.println(r);
        }
    }
}
