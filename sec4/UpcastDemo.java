package sec4;

public class UpcastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();

        p = s;

        p.whoami();
    }
}
