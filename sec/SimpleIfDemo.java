package sec;

import java.util.Scanner;

/**
 * SimpleIfDemo
 */
public class SimpleIfDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 홀, 짝 판별
        // System.out.print("숫자를 입력하세요 : ");

        // int number = in.nextInt();

        // if (number % 2 == 0) {
        // System.out.println("짝수");
        // }
        // if (number % 2 == 1) {
        // System.out.println("홀수");
        // }

        // if (number % 2 == 0) {
        // System.out.println("짝수");
        // } else {
        // System.out.println("홀수");
        // }

        // 학점 판별
        String grade;
        System.out.print("점수를 입력하세요 : ");
        int score = in.nextInt();

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score < 80 && score >= 70) {
            grade = "C";
        } else if (score < 70 && score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 학점은 " + grade + " 입니다.");
    }
}