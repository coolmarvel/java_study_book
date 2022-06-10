package sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        for (char c = 'A'; c <= 'G'; c++) {
            list.add(c);
        }

        System.out.println("섞기 전 :\t" + list);
        Collections.shuffle(list);
        System.out.println("섞은 후 :\t" + list);
    }
}
