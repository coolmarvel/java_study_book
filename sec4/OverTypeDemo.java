package sec4;

class Vehicle {
    String name = "탈 것";

    void whoami() {
        System.out.println("나는 탈 것이다!");
    }

    static void move() {
        System.out.println("이동한다.");
    }
}

class Car extends Vehicle {
    String name = "자동차";

    void whoami() {
        System.out.println("나는 자동차다!");
    }

    static void move() {
        System.out.println("달린다.");
    }
}

public class OverTypeDemo {
    public static void main(String[] args) {

        Vehicle v = new Car();
        System.out.println(v.name);
        v.whoami();
        v.move();
    }
}
