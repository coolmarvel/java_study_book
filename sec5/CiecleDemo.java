package sec5;

class Sircle implements Comparable {
    double radius;

    public Sircle(double radius) {
        this.radius = radius;
    }

    public int compareTo(Object o) {
        Sircle s = (Sircle) o;
        if (this.radius > s.radius) {
            return 1;
        } else if (this.radius == s.radius) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class CiecleDemo {
    public static void main(String[] args) {
        Sircle s1 = new Sircle(10.0);
        Sircle s2 = new Sircle(6.0);

        if (s1.compareTo(s2) > 0) {
            System.out.println("첫 번째 원이 두 번째 원보다 크다.");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("두 원의 크기가 같다.");
        } else {
            System.out.println("첫 번째 원이 두 번째 원보다 작다.");
        }
    }
}
