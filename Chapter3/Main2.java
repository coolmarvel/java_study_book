package Chapter3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 3번
        // 키보드로 입력된 양의 정수 중에서 짝수만 덧셈해서 출력하는 코드를 do~while문을 사용해 작성하시오. 단, 입력된 정수가 양수가
        // 아니라면 입력을 종료한다.
        Scanner in = new Scanner(System.in);
        int even = 0;

        do {
            System.out.print("양의 정수를 입력해주세요 : ");
            int number = in.nextInt();
            if (number % 2 == 0) {
                even = even + number;
            } else if (number <= 0) {
                break;
            }
        } while (true);
        System.out.printf("입력한 양의 정수 중에서 짝수의 합은 " + even);
    }
}
