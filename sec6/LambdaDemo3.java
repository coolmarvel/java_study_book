package sec6;

interface Printable {
    void print();
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        Printable p;
        p = () -> {
            System.out.println("안녕!");
        };
        p = () -> System.out.println("안녕!");
        p.print();
    }
}
