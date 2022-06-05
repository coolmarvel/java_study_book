package sec;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");

        // int rank = in.nextInt();

        // switch (rank) {
        // case 1:
        // System.out.println("1등입니다.");
        // break;
        // case 2:
        // System.out.println("2등입니다.");
        // break;
        // case 3:
        // System.out.println("3등입니다.");
        // break;

        // default:
        // System.out.println("등외 입니다.");
        // break;
        // }

        // String english = "odd";

        // switch (english) {
        // case "odd":
        // System.out.println("홀수입니다.");
        // break;
        // case "even":
        // System.out.println("짝수입니다..");
        // break;

        // default:
        // System.out.println("짝수도 홀수도 아닙니다.");
        // break;
        // }

        int month = in.nextInt();
        int year = 2022;
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
                    // 윤년
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("잘못된 달입니다.");
                break;
        }
        System.out.println(month + "월 달은 " + numDays + "일입니다.");
    }
}
