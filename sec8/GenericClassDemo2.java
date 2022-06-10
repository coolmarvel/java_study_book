package sec8;

import sec8.Generic.Cup;

public class GenericClassDemo2 {
    public static void main(String[] args) {
        Cup<Boricha> c = new Cup<Boricha>();

        c.setBeverage(new Boricha());

        Boricha b = c.getBeverage();
    }
}
