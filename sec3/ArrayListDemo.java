package sec3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        int data;
        int sum = 0;

        System.out.println("-1을 입력하시기 전까지의 입력값의 평균을 구합니다.");

        while ((data = in.nextInt()) >= 0) {
            scores.add(data);
        }

        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }

        System.out.println("평균 = " + sum / scores.size());
    }
}
