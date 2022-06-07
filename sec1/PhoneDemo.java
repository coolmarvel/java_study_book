package sec1;

/**
 * Phone
 */
class Phone {
    String model;
    int value;

    void print() {
        System.out.println(value + "만 원짜리 " + model + " 스마트폰");
    }

}

public class PhoneDemo {
    // 클래스 선언과 객체 생성
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.model = "Galaxy S22 Ultra";
        myPhone.value = 100;
        myPhone.print();

        Phone yourPhone = new Phone();
        yourPhone.model = "iPhone 13Pro";
        yourPhone.value = 120;
        yourPhone.print();
    }
}
