package sec8;

import java.util.StringTokenizer;

public class UnCheckDemo1 {
    public static void main(String[] args) {
        String s = "Time is money";
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "+");
        }
        System.out.println(st.nextToken());
    }
}
