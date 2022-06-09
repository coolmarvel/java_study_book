package Chapter7;

import java.util.Arrays;

class Book implements Comparable {
    // 자바에서 정렬이 나오면 제일 먼저 Comparable, Comparator를 떠올려라.
    int price;

    Book(int price) {
        this.price = price;
    }

    void print() {
        System.out.println("Book [price = " + price + "]");
    }

    public int compareTo(Object o) {
        Book book = (Book) o;

        if (this.price < book.price) {
            return -1;
        } else if (this.price > book.price) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class ArraysSortTest {
    public static void main(String[] args) {
        Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

        System.out.println("정렬 전");

        for (Book b : books) {
            b.print();
        }

        Arrays.sort(books);

        System.out.println("정렬 후");
        for (Book b : books) {
            b.print();
        }
    }
}
