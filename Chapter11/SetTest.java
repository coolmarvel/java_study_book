package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }
}

public class SetTest {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));

        Iterator<Person> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (Person person : set) {
            System.out.println("Person[" + person + "]");
        }
    }
}
