package sec8.Object;

import sec8.Beer;
import sec8.Boricha;

public class GenericClassDemo1 {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Boricha());

        c.setBeverage(new Beer());

        Beer b1 = (Beer) c.getBeverage();

        Boricha b2 = (Boricha) c.getBeverage();
    }
}
