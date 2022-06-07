package Chapter3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // 철수와 영희가 가위(s), 바위(r), 보(p) 게임을 한다. 다음 실행 결과와 같이 r, p, s 중 하나를 입력해 승자 또는 무승부를
        // 출력하는 프로그램을 작성하시오.
        // 철수 : r
        // 영희 : s
        // 철수, 승!

        Scanner in = new Scanner(System.in);
        String chursu, youngheui;

        System.out.print("철수 : ");
        chursu = in.next();
        System.out.print("영희 : ");
        youngheui = in.next();

        if ((chursu.equals("s") && (youngheui).equals("s")) || (chursu.equals("r") && youngheui.equals(("r")))
                || chursu.equals("p") && youngheui.equals("p")) {
            System.out.println("비겼습니다.");
        } else if ((chursu.equals("s") && (youngheui).equals("p")) || (chursu.equals("r") && youngheui.equals(("s")))
                || chursu.equals("p") && youngheui.equals("r")) {
            System.out.println("철수, 승!");
        } else {
            System.out.println("영희, 승!");
        }

    }
}
