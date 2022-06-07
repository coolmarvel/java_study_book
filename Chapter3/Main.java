package Chapter3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1번
        // 키보드로 입력한 정수가 19 이상이면 '성년', 아니면 '미성년'을 출력하는 프로그램을 if ~else 문을 사용해 작성하시오.
        System.out.print("정수를 입력해주세요 : ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 19) {
            System.out.println("성년");
        } else {
            System.out.println("미성년");
        }

    }
}
