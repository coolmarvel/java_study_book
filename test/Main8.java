package test;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("잘 있어");
    }

    public static void foo(String in) {
        System.out.printf(in);
        System.out.println();
    }

    private static void foo(String in, int first) {
        System.out.printf("%s %d", in, first);
        System.out.println();
    }

    public static void foo(String in, int first, int second) {
        System.out.printf("%s %d %d", in, first, second);
        System.out.println();
    }
}
