package sec9;

import java.util.HashSet;
import java.util.Set;

class Element {
    String value;

    public Element(String value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Element) {
            return ((Element) obj).value.equals(value);
        }
        return true;
    }

    public String toString() {
        return "Element[" + value + "]";
    }

    public int hashCode() {
        return value.hashCode();
    }
    // 문자열 value를 사용해 해시코드를 생성하기 때문에 동일한 문자열이면 동일한 해시값을 반환한다.
}

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Element> h = new HashSet<>();
        h.add(new Element("안녕"));
        h.add(new Element("안녕"));
        System.out.println(h.size());
        System.out.println(h);
    }
}
