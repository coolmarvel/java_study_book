package sec5;

interface Coin {
    int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
    // int만 표시되어 있어도, public static final int이다.
}

public class CoinDemo {
    public static void main(String[] args) {
        System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
    }
}
