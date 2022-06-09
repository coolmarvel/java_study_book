package Chapter7;

interface Edible {
    void eat();
}

interface Sweetable {
    void sweet();
}

interface Delicious extends Edible, Sweetable {

}
