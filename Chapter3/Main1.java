package Chapter3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 2번
        // 키보드로 등수를 입력받아 1등이면 '아주 잘했습니다', 2~3등이면 '잘했습니다', 4~6등이면 '보통입니다', 그 외 등수이면
        // '노력해야겠습니다'라고 출력하는 프로그램을 switch문을 사용해 작성하시오.
        System.out.print("등수를 입력해주세요 :");
        Scanner in = new Scanner(System.in);
        int rank = in.nextInt();

        switch (rank) {
            case 1:
                System.out.println("아주 잘했습니다");
                break;
            case 2:
            case 3:

                System.out.println("잘했습니다.");
                break;
            case 4:

            case 5:
            case 6:

                System.out.println("보통입니다.");
                break;

            default:
                System.out.println("노력해야겠습니다.");
                break;
        }
    }
}
