package sec9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> gt10 = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(30));
        }

        for (Integer integer : list) {
            if (integer > 10) {
                gt10.add(integer);
            }
        }

        Collections.sort(gt10);
        System.out.println(gt10);

        list.stream().filter(i -> i > 10).sorted().forEach(x -> System.out.print(x + " "));
    }
}
