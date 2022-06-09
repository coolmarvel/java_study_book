package sec5;

public class ControllableDemo {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.turnOn();
        tv.turnOff();
        tv.repair();

        Controllable.reset();
    }
}
