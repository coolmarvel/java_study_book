package test;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int in = new Scanner(System.in).nextInt();
        if (isPrime(in)) {
            System.out.println(in + "는 소수입니다.");
        } else {
            System.out.println(in + "는 소수가 아닙니다.");
        }
    }

    public static boolean isPrime(int in) {
        if (in <= 1) {
            return false;
        }
        for (int i = 2; i < in; i++) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }
}
