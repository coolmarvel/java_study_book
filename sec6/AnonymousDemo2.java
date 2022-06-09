package sec6;

public class AnonymousDemo2 {
    public static void main(String[] args) {
        Bird b = new Bird() {
            public void move() {
                System.out.println("독수리가 난다~~~~");
            }
        };
        b.move();
    }
}
