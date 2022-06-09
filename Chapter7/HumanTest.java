package Chapter7;

interface Human {
    void eat();

    void print();

    static void echo() {
        System.out.println("야호!!!");
    }
}

class Worker implements Human {
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }

    public void print() {
        System.out.println("인간입니다.");
    }
}

class Student implements Human {
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    public void print() {
        System.out.println("학생입니다.");
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student();
        s.print();
        s.eat();

        Worker p = new Worker();
        p.print();
        p.eat();
    }
}
