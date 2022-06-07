package Chapter4;

class GolfClub {
    private int num;
    private String name;

    public GolfClub() {
        this.num = 7;
        this.name = "아이언";
    }

    public GolfClub(int num) {
        this.name = "아이언";
        this.num = num;

    }

    public GolfClub(String name) {
        this.name = name;
        this.num = -1;
    }

    public void print() {
        if (num < 0) {
            System.out.println(name + "입니다.");
        } else {
            System.out.println(num + "번 " + name + "입니다.");
        }
    }
}

public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        GolfClub g2 = new GolfClub(8);
        GolfClub g3 = new GolfClub("퍼터");

        g1.print();
        g2.print();
        g3.print();
    }
}
