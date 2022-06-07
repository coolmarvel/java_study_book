package Chapter5;

import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("영어 문자열을 입력하세요 : ");
        String s = in.next();
        System.out.print("찾으실 단어를 입력하세요 : ");
        char c = in.next().charAt(0);

        System.out.printf("찾으시는 단어의 갯수 : " + countChar(s, c));
    }

    // countChar method
    static int countChar(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
