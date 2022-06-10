package sec9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo2 {
    public static void main(String[] args) {
        int[] ia = { 1, 6, 3, 9, 5, 4, 2 };
        IntStream is = Arrays.stream(ia);

        int sum = is.filter(i -> i > 5).sum();

        System.out.println(sum);
    }
}
