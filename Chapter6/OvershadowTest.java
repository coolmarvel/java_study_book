package Chapter6;

class Parent {
    String name = "영조";

    void print() {
        System.out.println("나는 영조다.");
    }
}

class Child extends Parent {
    String name = "사도세자";

    void print() {
        System.out.println("나는 세도세자다.");
    }
}

public class OvershadowTest {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name);
        p.print();
    }
}
