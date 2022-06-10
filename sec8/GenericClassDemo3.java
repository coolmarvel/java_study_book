package sec8;

import sec8.Generic.Cup;

public class GenericClassDemo3 {
    public static void main(String[] args) {
        Cup c1 = new Cup();

        c1.setBeverage(new Beer());

        Beer beer = (Beer) c1.getBeverage();
    }
}
