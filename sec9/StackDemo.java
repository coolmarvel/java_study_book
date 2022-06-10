package sec9;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();

        s1.push("사과");
        s1.push("바나나");
        s1.push("체리");

        System.out.println(s1.peek());

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println();

        Stack<String> s2 = new Stack<>();

        // s1.add(10);
        // s1.add(20);
        // s1.add(1, 100);

        // for (int value : s2) {
        // System.out.print(value + " ");
        // }
        System.out.println();

        while (!s2.empty()) {
            System.out.print(s2.pop() + " ");
        }
    }
}
