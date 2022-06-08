package Chapter6;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 접근자
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 설정자
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person {
    int class_num;

    Student(String name, int age, int class_num) {
        super(name, age);
        this.class_num = class_num;
    }

    // 접근자
    public int getClass_num() {
        return class_num;
    }

    // 설정자
    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + "]");
    }
}

class ForeignStudent extends Student {
    String country;

    ForeignStudent(String name, int age, int class_num, String country) {
        super(name, age, class_num);
        this.country = country;
    }

    // 접근자
    public String getCountry() {
        return country;
    }

    // 설정자
    public void setCountry(String country) {
        this.country = country;
    }

    String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + class_num + ", 국적" + country + "]");
    }

}

public class Main1 {
    public static void main(String[] args) {
        Person[] p = { new Person("이성현", 26), new Student("이성현", 26, 3), new ForeignStudent("Amy", 30, 200, "Japan") };

        for (Person k : p) {
            System.out.println(k.show());
        }
    }
}
