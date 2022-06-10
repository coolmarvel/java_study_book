package sec8;

import sec8.Generic.Cup;

public class GenericClassDemo1 {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Boricha());

        c.setBeverage(new Beer());

        Beer b1 = (Beer) c.getBeverage();

        Boricha b2 = (Boricha) c.getBeverage();
    }
}
