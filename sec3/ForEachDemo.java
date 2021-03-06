package sec3;

import java.util.Scanner;

public class ForEachDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scores[] = new int[5];
        int sum = 0;

        System.out.println("정수를 5개 입력하세요.");
        
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }

        for (int s : scores) {
            sum += s;
        }

        System.out.println("평균 = " + sum / 5.0);
    }
}
