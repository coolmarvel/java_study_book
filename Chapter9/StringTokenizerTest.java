package Chapter9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        System.out.print("입력 : ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringTokenizer st = new StringTokenizer(input);

        int count = st.countTokens();
        System.out.println("단어 개수 : " + count);

        String[] st_arrays = new String[count];
        for (int i = 0; i < count; i++) {
            st_arrays[i] = st.nextToken();
        }

        Arrays.sort(st_arrays);

        for (int i = 0; i < count; i++) {
            System.out.print(st_arrays[i] + ", ");
        }
    }
}
