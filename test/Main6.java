package test;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        String first = input("철수");
        String second = input("영희");
        whosWin(first, second);
    }

    // 이름을 받는 메소드
    public static String input(String n) {
        String pick;
        Scanner in = new Scanner(System.in);
        System.out.printf("%s : ", n);
        pick = in.next();

        return pick;
    }

    // 가위바위보 메소드
    public static void whosWin(String first, String second) {
        if ((first.equals("s") && (second).equals("s")) || (first.equals("r") && second.equals(("r")))
                || first.equals("p") && second.equals("p")) {
            System.out.println("비겼습니다.");
        } else if ((first.equals("s") && (second).equals("p")) || (first.equals("r") && second.equals(("s")))
                || first.equals("p") && second.equals("r")) {
            System.out.println("철수, 승!");
        } else {
            System.out.println("영희, 승!");
        }
    }
}
