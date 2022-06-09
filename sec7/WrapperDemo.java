package sec7;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer bi1 = new Integer(10);

        // Integer타입을 int타입으로 변환
        int i1 = bi1.intValue();

        // Integer타입을 double타입으로 변환
        double d = bi1.doubleValue();

        // 박싱
        Integer bi2 = 20;

        // 언박싱
        int i2 = bi2 + 20;
        System.out.println(i1);
        System.out.println(d);
        System.out.println(i2);
        System.out.println(bi1);
    }
}
